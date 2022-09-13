package com.banco.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.entities.Account;
import com.banco.app.repositories.IAccountRepository;

/**
 * ClientService
 */
@Service
public class AccountService implements IAccountService {

  @Autowired
  private IAccountRepository repository 

  @Autowired
  private IClientRepository clientRepository;

  @Override
  public List<Account> getAccounts() {
    return (List<Account>) repository.findAll();
  }

  @Override
  public Account getAccountById(Long id) {
    return (Account) repository.findById(id).get();
  }

  @Override
  public void deleteAccountById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public void saveAccount(Account account, long id) {
    Account.setClient(clientRepository.getReferenceById(id));
    repository.save(Account);
  }

}
