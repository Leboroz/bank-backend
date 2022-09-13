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

import com.banco.app.Dto.Responses.ResponseAccount;
import com.banco.app.entities.Account;
import com.banco.app.services.ICuentaService;

/**
 * ClienteController
 */
@RestController
@RequestMapping("/api/account")
public class AccountController {

  @Autowired
  private IAccountService service;

  @GetMapping
  public List<ResponseCuenta> get() {
    return service.getCuentas().stream().map(cuenta -> new ResponseCuenta(cuenta)).toList();
  }

  @GetMapping("/{id}")
  public Cuenta getClienteById(@PathVariable String id) {
    return service.getCuentaById(Long.parseLong(id));
  }

  @DeleteMapping("/{id}")
  public void deleteClienteById(@PathVariable String id) {
    service.deleteCuentaById(Long.parseLong(id));
  }

  @PostMapping("/{id}/cliente")
  public void saveCuenta(@RequestBody Cuenta cuenta, @PathVariable String id) {
    service.saveCuenta(cuenta, Long.parseLong(id));
  }

}
