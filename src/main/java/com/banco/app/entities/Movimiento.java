package com.banco.app.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movimientos")
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Movimiento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date fecha;
  private String tipo;
  private double saldoInicial;
  private boolean estado;
  private Long cuentaId;

  public Movimiento(Date fecha, String tipo, int saldoInicial, Boolean estado, Long cuentaId) {
    this.fecha = fecha;
    this.tipo = tipo;
    this.saldoInicial = saldoInicial;
    this.estado = estado;
    this.cuentaId = cuentaId;
  }
}
