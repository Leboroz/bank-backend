package com.banco.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Cliente;

/**
 * ClientRepository
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}
