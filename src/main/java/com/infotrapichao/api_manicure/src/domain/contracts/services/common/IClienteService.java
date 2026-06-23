package com.infotrapichao.api_manicure.src.domain.contracts.services.common;

import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.ClienteDTO;
import com.infotrapichao.api_manicure.src.domain.models.common.Cliente;

import java.util.List;

public interface IClienteService {
    Cliente findById(Integer id);
    Cliente findByCpf(String cpf);
    Cliente create(Cliente cliente);
    Cliente update(Cliente cliente);
    List<Cliente> findAll();
    List<Cliente> findAllByFilter(ClienteDTO filter);
}
