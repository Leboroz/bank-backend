package com.banco.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Cuenta;

/**
 * ClientRepository
 */
@Repository
public interface ICuentaRepository extends CrudRepository<Cuenta, Long> {

}
