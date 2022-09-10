package com.banco.app.Dto;

import java.util.ArrayList;
import java.util.List;

import com.banco.app.Dto.Responses.ResponseAccount;
import com.banco.app.Dto.Responses.ResponseClient;
import com.banco.app.Dto.Responses.ResponseTransaction;
import com.banco.app.entities.Account;
import com.banco.app.entities.Client;
import com.banco.app.entities.Transaction;

/**
 * Mapper
 */
public class Mapper {

  public static ResponseClient clientToResponseClient(Client client) {
    ResponseClient responseClient = new ResponseClient(client);
    return responseClient;
  }

  public static List<ResponseClient> clientsToResponseClients(List<Client> clients) {
    List<ResponseClient> responseClients = new ArrayList<>();
    for (Client client : clients) {
      responseClients.add(new ResponseClient(client));
    }
    return responseClients;
  }

  public static ResponseAccount accountToResponseAccount(Account account) {
    ResponseAccount responseAccount = new ResponseAccount(account);
    return responseAccount;
  }

  public static List<ResponseAccount> accountsToResponseAccounts(List<Account> accounts) {
    List<ResponseAccount> responseAccounts = new ArrayList<>();
    for (Account account : accounts) {
      responseAccounts.add(new ResponseAccount(account));
    }
    return responseAccounts;
  }

  public static ResponseTransaction transactionToResponseTransaction(Transaction transaction) {
    ResponseTransaction responseTransaction = new ResponseTransaction(transaction);
    return responseTransaction;
  }

  public static List<ResponseAccount> transactionsToResponseTransactions(List<Account> accounts) {
    List<ResponseAccount> responseAccounts = new ArrayList<>();
    for (Account account : accounts) {
      responseAccounts.add(new ResponseAccount(account));
    }
    return responseAccounts;
  }
}
