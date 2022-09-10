package com.banco.app.Dto.Responses;

import com.banco.app.entities.Account;
import com.banco.app.entities.Client;

import lombok.Data;

/**
 * ResponseCuenta
 */
@Data
public class ResponseAccount {

  private Long id;
  private int accountNumber;
  private String type;
  private double initialValue;
  private boolean state;
  private Client client;

  public ResponseAccount(Account account) {
    id = account.getId();
    accountNumber = account.getNumeroDeCuenta();
    type = account.getTipo();
    initialValue = account.getSaldoInicial();
    state = account.isEstado();
    client = account.getClient();
  }
}
