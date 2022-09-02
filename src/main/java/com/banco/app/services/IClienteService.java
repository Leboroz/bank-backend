package com.banco.app.services;

import java.util.List;

import com.banco.app.entities.Cliente;

/**
 * IClientService
 */
public interface IClienteService {
  List<Cliente> getClientes();
}
