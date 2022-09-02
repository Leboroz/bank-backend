package com.banco.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.entities.Cliente;
import com.banco.app.repositories.IClienteRepository;

/**
 * ClientService
 */
@Service
public class ClienteService implements IClienteService {

  @Autowired
  private IClienteRepository repository;

  @Override
  public List<Cliente> getClientes() {
    return (List<Cliente>) repository.findAll();
  }

  @Override
  public Cliente getClienteById(Long id) {
    return (Cliente) repository.findById(id).get();
  }

  @Override
  public void deleteClienteById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public void saveCliente(Cliente cliente) {
    repository.save(cliente);
  }
}
