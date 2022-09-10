package com.banco.app.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date date;
  private String type;
  private double initialValue;
  private double value;
  private boolean state;

  @OneToOne(cascade = CascadeType.ALL)
  private Account account;

  public Transaction(Date date, String type, int initialValue, double value, Boolean state, Account account) {
    this.date = date;
    this.type = type;
    this.initialValue = initialValue;
    this.value = value;
    this.state = state;
    this.account = account;
  }

}
