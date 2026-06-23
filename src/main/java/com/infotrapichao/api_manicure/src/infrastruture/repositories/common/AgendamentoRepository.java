package com.infotrapichao.api_manicure.src.infrastruture.repositories.common;

import com.infotrapichao.api_manicure.src.domain.models.common.Agendamento;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    List<Agendamento> findAll(Specification<Agendamento> agendamentoSpecification);

}
