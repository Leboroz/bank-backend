package com.banco.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClientService
 */
@Service
public class TransactionService implements ITransactionService {

  @Autowired
  private ITransactionRepository repository;

  @Autowired
  private ICuentaRepository cuentaRepository;

  @Override
  public List<ResponseMovimiento> getMovimientos() {
    return repository.findAll().stream()
        .map(movimiento -> new ResponseMovimiento(movimiento)).toList();
  }

  @Override
  public Movimiento getMovimientoById(Long id) {
    return (Movimiento) repository.findById(id).get();
  }

  @Override
  public void deleteMovimientoById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public void saveMovimiento(Movimiento movimiento, Long id) {
    movimiento.setCuenta(cuentaRepository.getReferenceById(id));
    repository.save(movimiento);
  }

}
