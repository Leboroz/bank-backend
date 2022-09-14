package com.banco.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.app.Dto.Responses.ResponseTransaction;
import com.banco.app.entities.Movimiento;
import com.banco.app.services.IMovimientoService;

/**
 * ClienteController
 */
@RestController
@RequestMapping("/api/movimientos")
public class TransactionController {

  @Autowired
  private IMovimientoService service;

  @GetMapping
  public List<ResponseTransaction> getMovimientos() {
    // return service.getMovimientos().stream().map(movimiento -> new
    // ResponseMovimiento(movimiento)).toList();
    return null;
  }

  @GetMapping("/{id}")
  public Transaction getTransactionById(@PathVariable String id) {
    return service.getTransactionById(Long.parseLong(id));
  }

  @DeleteMapping("/{id}")
  public void deleteMovimientoById(@PathVariable String id) {
    service.deleteMovimientoById(Long.parseLong(id));
  }

  @PostMapping("/{id}/cuenta")
  public void saveTransaction(@RequestBody Transaction transaction, @PathVariable String id) {
    service.saveTransaction(transaction, Long.parseLong(id));
  }

}
