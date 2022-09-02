package com.banco.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.app.entities.Cliente;
import com.banco.app.services.IClienteService;

/**
 * ClienteController
 */
@RestController
public class ClienteController {

  @Autowired
  private IClienteService service;

  @GetMapping("/clientes")
  public List<Cliente> getClientes() {
    return service.getClientes();
  }

}
