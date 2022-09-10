package com.banco.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "clients")
@OnDelete(action = OnDeleteAction.CASCADE)
public class Client extends Person {
  private String password;
  private boolean state;

  @JsonManagedReference
  @OneToMany(cascade = CascadeType.ALL)
  private List<Account> accounts = new ArrayList<>();

  public Client(PersonaType role, String name, String sex, int age, int identification, String address,
      String phoneNumber, String password, boolean state) {
    super(role, name, sex, age, identification, address, phoneNumber);
    this.password = password;
    this.state = state;
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public void removeAccount(Account account) {
    accounts.remove(account);
  }
}
