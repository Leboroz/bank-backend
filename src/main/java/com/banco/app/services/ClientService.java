package com.banco.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.repositories.IClientRepository;

import com.banco.app.Dto.Mapper;
import com.banco.app.Dto.Requests.RequestClient;
import com.banco.app.Dto.Responses.ResponseClient;
import com.banco.app.entities.Account;
import com.banco.app.entities.Client;
import com.banco.app.repositories.IAccountRepository;

/**
 * ClientService
 */
@Service
public class ClientService implements IClientService {

  @Autowired
  private IClientRepository repository;

  private AccountService accountService;

  @Override
  public List<ResponseClient> getClients() {
    return Mapper.clientsToResponseClients((List<Client>) repository.findAll());
  }

  @Override
  public List<ResponseClient> getClientsWithAccounts() {
    List<ResponseClient> clientsWithAccounts = new ArrayList<>();
    repository.findAll().forEach(client -> {
      List<Account> accounts = accountService.getAccountsByClientId(client.getId);
      if (Objects.nonNull(accounts)) {
        ResponseClient responseClient = new ResponseClient(client);
        responseClient.setAccounts(accounts);
        clientsWithAccounts.add(responseClient);
      }
    });
    return clientsWithAccounts;
  }

  @Override
  public Client getClient(Long id) {
    return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Client not found"));
  }

  @Transactional
  @Override
  public Client updateClient(Long id, RequestClient requestClient) {
    Client client = getClient(id);
    client.setId(requestClient.getId());
    client.setName(requestClient.getName());
    client.setSet(requestClient.getSex());
    client.setAge(requestClient.getAge());
    client.setIdentification(requestClient.getIdentification());
    client.setState(requestClient.isState());
    client.setPhoneNumber(requestClient.getPhoneNumber());
    client.setAddress(requestClient.getAddress());
    client.setPassword(requestClient.getPassword());
    return client;
  }

  @Override
  public Client deleteClient(Long id) {
    Client client = getClient(id);
    repository.delete(client);
    return client;
  }

  @Override
  public Client saveClient(RequestClient requestClient) {
    Client client = new Client();
    client.setId(requestClient.getId());
    client.setName(requestClient.getName());
    client.setSet(requestClient.getSex());
    client.setAge(requestClient.getAge());
    client.setIdentification(requestClient.getIdentification());
    client.setState(requestClient.isState());
    client.setPhoneNumber(requestClient.getPhoneNumber());
    client.setAddress(requestClient.getAddress());
    client.setPassword(requestClient.getPassword());
    return repository.save(client);
  }
}
