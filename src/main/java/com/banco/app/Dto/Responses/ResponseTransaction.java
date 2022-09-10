package com.banco.app.Dto.Responses;

import java.sql.Date;

import com.banco.app.entities.Transaction;

import lombok.Data;

@Data
public class ResponseTransaction {
  private Long id;
  private Date date;
  private String name;
  private int accountNumber;
  private String type;
  private boolean state;
  private double initialValue;
  private double value;
  private double saldoDisponible;
  private double availableValue;

  public ResponseTransaction(Transaction transaction) {
    this.id = transaction.getId();
    this.date = transaction.getDate();
    this.name = transaction.getAccount().getClient().getName();
    this.accountNumber = transaction.getAccount().getAccountNumber();
    this.type = transaction.getType();
    this.initialValue = transaction.getInitialValue();
    this.value = transaction.getValue();
    this.state = transaction.getState();
    this.availableValue = transaction.getInitialValue() + transaction.value();
  }

}
