package com.banco.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Movimiento;

/**
 * ClientRepository
 */
@Repository
public interface IMovimientoRepository extends CrudRepository<Movimiento, Long> {

}
