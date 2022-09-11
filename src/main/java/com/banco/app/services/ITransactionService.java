package com.banco.app.services;

import java.util.List;

import com.banco.app.Dto.Responses.ResponseTransaction;
import com.banco.app.entities.Transaction;

/**
 * IClientService
 */
public interface ITransactionService {
  List<ResponseTransaction> getTransactions();

  Transaction getTransactionById(Long id);

  void deleteTransactionById(Long id);

  void saveTransaction(Transaction transaction, Long id);
}
