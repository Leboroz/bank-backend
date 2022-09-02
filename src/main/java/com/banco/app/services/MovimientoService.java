package com.banco.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.repositories.IMovimientoRepository;

/**
 * ClientService
 */
@Service
public class MovimientoService implements IMovimientoService {

  @Autowired
  private IMovimientoRepository repository;

}
