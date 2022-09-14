package com.banco.app.Dto.Requests;

import java.sql.Date;

import com.banco.app.entities.Account;

import lombok.Data;

/**
 * RequestClient
 */
@Data
public class RequestTransaction {
  private Date date;
  private String type;
  private double initialValue;
  private double value;
  private boolean state;
  private Long accountId;
}
