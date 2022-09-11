package com.banco.app.services;

import java.util.List;

import com.banco.app.entities.Account;

/**
 * IClientService
 */
public interface IAccountService {
  List<Account> getAccounts();

  Account getAccountById(Long id);

  void deleteAccountById(Long id);

  void saveAccount(Account account, long id);
}
