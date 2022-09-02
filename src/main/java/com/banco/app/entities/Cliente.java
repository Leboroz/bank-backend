package com.banco.app.entities;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Clientes")
public class Cliente extends Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String contraseña;
  private boolean estado;

  public Cliente(String nombre, String genero, int edad, int identificacion, String direccion, String telefono,
      String contraseña, boolean estado) {
    super(nombre, genero, edad, identificacion, direccion, telefono);
    this.contraseña = contraseña;
    this.estado = estado;
  }
}
