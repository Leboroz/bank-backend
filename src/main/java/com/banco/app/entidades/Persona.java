package com.banco.app.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Persona {
  @Getter
  @Setter
  private String nombre;
  private String genero;
  private int edad;
  private int identificacion;
  private String direccion;
  private String telefono;
}
