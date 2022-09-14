package com.banco.app.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.entities.Account;
import com.banco.app.repositories.IAccountRepository;
import com.banco.app.repositories.IClientRepository;
import com.banco.app.Dto.Requests.RequestAccount;

/**
 * ClientService
 */
@Service
public class AccountService implements IAccountService {

  @Autowired
  private IAccountRepository repository;

  private ClientService clientService;

  @Override
  public List<Account> getAccounts() {
    return (List<Account>) repository.findAll();
  }

  @Override
  public List<Account> getAccountsByClientId(Long id) {
    return (List<Account>) repository.findByClientId(id);
  }

  @Override
  public Account getAccount(Long id) {
    return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Account not found"));
  }

  @Override
  public Account deleteAccountById(Long id) {
    Account account = getAccount(id);
    repository.delete(account);
    return account;
  }

  @Transactional
  @Override
  public Account updateAccount(Long id, RequestAccount requestAccount) {
    Account account = getAccount(id);
    account.setAccountNumber(requestAccount.getAccountNumber());
    account.setType(requestAccount.getType());
    account.setInitialValue(requestAccount.getInitialValue());
    account.setState(requestAccount.getState());
    account.setClient(clientService.getClient(requestAccount.getClientId()));
    return account;
  }

  @Override
  public Account saveAccount(RequestAccount requestAccount) {
    Account account = new Account();
    account.setAccountNumber(requestAccount.getAccountNumber());
    account.setType(requestAccount.getType());
    account.setInitialValue(requestAccount.getInitialValue());
    account.setState(requestAccount.getState());
    account.setClient(clientService.getClient(requestAccount.getClientId()));
    return repository.save(account);
  }

}
