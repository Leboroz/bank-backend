package com.banco.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

/**
 * ClienteController
 */
@Controller
public class ClienteController {

  public List<Cliente> getClientes() {
    List<Cliente> clientes = new ArrayList<>();
    return clientes;
  }

}
