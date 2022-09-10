package com.banco.app.Dto.Requests;

import lombok.Data;

/**
 * RequestClient
 */
@Data
public class RequestClient {
  private String name;
  private String sex;
  private int age;
  private int identification;
  private String address;
  private String phoneNumber;
  private String password;
  private boolean state;
}
