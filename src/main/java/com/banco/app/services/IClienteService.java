package com.banco.app.services;

import java.util.List;
import com.banco.app.entities.Cliente;

/**
 * IClientService
 */
public interface IClienteService {
  List<Cliente> getClientes();

  Cliente getClienteById(Long id);

  void deleteClienteById(Long id);

  void saveCliente(Cliente cliente);
}
