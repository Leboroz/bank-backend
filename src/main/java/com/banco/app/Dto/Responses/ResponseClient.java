package com.banco.app.Dto.Responses;

import com.banco.app.entities.Client;

import lombok.Data;

/**
 * ResponseCuenta
 */
@Data
public class ResponseClient {

  private Long id;
  private String name;
  private String sex;
  private int age;
  private int identification;
  private boolean state;
  private final String ROLE = "CLIENT";
  private String phoneNumber;
  private String address;
  private String password;

  public ResponseClient(Client client) {
    id = client.getId();
    name = client.getName();
    sex = client.getSex();
    age = client.getAge();
    identification = client.getIdentification();
    state = client.isState();
    phoneNumber = client.getPhoneNumber();
    address = client.getAddress();
    password = client.getPassword();
  }
}
