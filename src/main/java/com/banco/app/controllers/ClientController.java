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

import com.banco.app.Dto.Responses.ResponseCliente;
import com.banco.app.entities.Cliente;
import com.banco.app.services.IClienteService;

/**
 * ClienteController
 */
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

  @Autowired
  private IClienteService service;

  @GetMapping
  public List<ResponseCliente> getClientes() {
    return service.getClientes().stream().map(cliente -> new ResponseCliente(cliente)).toList();
  }

  @GetMapping("/cuentas")
  public List<Cliente> getClientesWithCuentas() {
    return service.getClientes();
  }

  @GetMapping("/{id}")
  public Cliente getClienteById(@PathVariable String id) {
    return service.getClienteById(Long.parseLong(id));
  }

  @DeleteMapping("/{id}")
  public void deleteClienteById(@PathVariable String id) {
    service.deleteClienteById(Long.parseLong(id));
  }

  @PostMapping
  public String saveCliente(@RequestBody Cliente cliente) {
    service.saveCliente(cliente);
    return cliente.getRol().getDepCode();
  }

}
