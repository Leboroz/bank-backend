package com.banco.app.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.banco.app.entities.Cliente;
import com.banco.app.entities.Cuenta;

import javax.persistence.criteria.*;

public class CuentaSpecifications {

  public static Specification<Cuenta> hasBookWithTitle(String bookTitle) {
    return (root, query, criteriaBuilder) -> {
      Join<Cuenta, Cliente> cuentaCliente = root.join("clientes");
      return criteriaBuilder.equal(cuentaCliente.get("title"), bookTitle);
    };
  }

}
