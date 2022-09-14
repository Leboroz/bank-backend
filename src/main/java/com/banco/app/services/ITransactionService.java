package com.banco.app.services;

import java.util.List;

import com.banco.app.Dto.Requests.RequestTransaction;
import com.banco.app.Dto.Responses.ResponseTransaction;
import com.banco.app.entities.Transaction;

/**
 * IClientService
 */
public interface ITransactionService {
  List<ResponseTransaction> getTransactions();

  Transaction getTransaction(Long id);

  ResponseTransaction deleteTransaction(Long id);

  ResponseTransaction updateTransaction(RequestTransaction transaction, Long id);

  ResponseTransaction saveTransaction(RequestTransaction transaction);
}
