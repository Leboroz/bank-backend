
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

@Entity
@Table(name = "Cuentas")
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Cuenta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int numeroDeCuenta;
  private String tipo;
  private double saldoInicial;
  private boolean estado;
  private Cliente cliente;

  public Cuenta(int numeroDeCuenta, String tipo, int saldoInicial, Boolean estado, Cliente cliente) {
    this.numeroDeCuenta = numeroDeCuenta;
    this.tipo = tipo;
    this.saldoInicial = saldoInicial;
    this.estado = estado;
    this.cliente = cliente;
  }
}
