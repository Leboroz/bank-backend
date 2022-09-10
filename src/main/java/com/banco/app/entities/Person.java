package com.banco.app.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "people")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;

  @Enumerated(value = EnumType.STRING)
  private PersonaType role;

  private String name;
  private String sex;
  private int age;
  private int identification;
  private String address;
  private String phoneNumber;

  public Person(PersonaType role, String name, String sex, int age, int identification, String address,
      String phoneNumber) {
    this.role = role;
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.identification = identification;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }
}
