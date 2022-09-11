package com.banco.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Transaction;

/**
 * ClientRepository
 */
@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

}
