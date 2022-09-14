package com.banco.app.services;

import java.util.List;

import com.banco.app.Dto.Requests.RequestAccount;
import com.banco.app.entities.Account;

/**
 * IClientService
 */
public interface IAccountService {
  List<Account> getAccounts();

  List<Account> getAccountsByClientId(Long id);

  Account getAccount(Long id);

  Account deleteAccountById(Long id);

  Account updateAccount(Long id, RequestAccount requestAccount);

  Account saveAccount(RequestAccount requestAccount);
}
