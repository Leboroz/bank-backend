package com.banco.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.Dto.Requests.RequestTransaction;
import com.banco.app.Dto.Responses.ResponseTransaction;
import com.banco.app.entities.Transaction;
import com.banco.app.repositories.IAccountRepository;
import com.banco.app.repositories.ITransactionRepository;

/**
 * ClientService
 */
@Service
public class TransactionService implements ITransactionService {

  @Autowired
  private ITransactionRepository repository;

  private AccountService accountService;

  @Override
  public List<ResponseTransaction> getTransactions() {
    return repository.findAll().stream()
        .map(transaction -> new ResponseTransaction(transaction)).toList();
  }

  @Override
  public Transaction getTransaction(Long id) {
    return (Transaction) repository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Transaction not found"));
  }

  @Override
  public ResponseTransaction deleteTransaction(Long id) {
    Transaction transaction = getTransaction(id);
    repository.delete(transaction);
    return new ResponseTransaction(transaction);

  }

  @Override
  public ResponseTransaction updateTransaction(RequestTransaction requestTransaction, Long id) {
    Transaction transaction = getTransaction(id);
    transaction.setDate(requestTransaction.getDate());
    transaction.setType(requestTransaction.getType());
    transaction.setInitialValue(requestTransaction.getInitialValue());
    transaction.setValue(requestTransaction.getValue());
    transaction.setState(requestTransaction.getState());
    transaction.setState(accountService.getAccount(requestTransaction.getAccountId()));
    return new ResponseTransaction(repository.save(transaction));
  }

  @Override
  public ResponseTransaction saveTransaction(RequestTransaction requestTransaction) {
    Transaction transaction = new Transaction();
    transaction.setDate(requestTransaction.getDate());
    transaction.setType(requestTransaction.getType());
    transaction.setInitialValue(requestTransaction.getInitialValue());
    transaction.setValue(requestTransaction.getValue());
    transaction.setState(requestTransaction.getState());
    transaction.setState(accountService.getAccount(requestTransaction.getAccountId()));
    return new ResponseTransaction(repository.save(transaction));
  }

}
