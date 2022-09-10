package com.banco.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.banco.app.entities.Account;

/**
 * ClientRepository
 */
@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {
  @Query(value = "SELECT * FROM accounts WHERE client_id = ?1", nativeQuery = true)
  List<Account> findByClientId(Long id);
}
