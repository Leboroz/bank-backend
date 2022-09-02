package com.banco.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.repositories.IClienteRepository;

/**
 * ClientService
 */
@Service
public class CuentaService implements ICuentaService {

  @Autowired
  private IClienteRepository repository;

}
