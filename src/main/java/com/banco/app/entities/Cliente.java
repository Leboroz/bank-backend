package com.banco.app.entities;

import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "Clientes")
public class Cliente extends Persona {

  public Cliente(String nombre, String genero, int edad, int identificacion, String direccion, String telefono) {
    super(nombre, genero, edad, identificacion, direccion, telefono);
  }
}
