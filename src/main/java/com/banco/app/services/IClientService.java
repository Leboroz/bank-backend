package com.banco.app.services;

import java.util.List;
import com.banco.app.entities.Client;

/**
 * IClientService
 */
public interface IClientService {
  List<Client> getClients();

  List<Client> getClientsWithAccounts();

  Client getClientById(Long id);

  void deleteClientById(Long id);

  void saveClient(Client client);
}
