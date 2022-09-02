package com.banco.app.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Persona {
  private String nombre;
  private String genero;
  private int edad;
  private int identificacion;
  private String direccion;
  private String telefono;

  public Persona(String nombre, String genero, int edad, int identificacion, String direccion, String telefono) {
    this.nombre = nombre;
    this.genero = genero;
    this.edad = edad;
    this.identificacion = identificacion;
    this.direccion = direccion;
    this.telefono = telefono;
  }
}
