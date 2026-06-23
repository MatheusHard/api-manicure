package com.infotrapichao.api_manicure.src.infrastruture.repositories.common;

import com.infotrapichao.api_manicure.src.domain.models.common.Cliente;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByCpf(String cpf);
    List<Cliente> findAll(Specification<Cliente> clienteSpecification);
}
