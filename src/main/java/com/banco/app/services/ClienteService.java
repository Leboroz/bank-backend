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

}
