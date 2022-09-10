package com.banco.app.Dto.Requests;

import com.banco.app.entities.Client;

import lombok.Data;

/**
 * RequestClient
 */
@Data
public class RequestAccount {
  private int accountNumber;
  private String type;
  private double initialValue;
  private boolean state;
  private Client client;
}
