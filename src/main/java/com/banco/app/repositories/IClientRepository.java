package com.banco.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Client;

/**
 * ClientRepository
 */
@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {

}
