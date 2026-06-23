package com.infotrapichao.api_manicure.src.application.services.common;

import com.infotrapichao.api_manicure.src.application.contracts.common.IClienteApplication;
import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.ClienteDTO;
import com.infotrapichao.api_manicure.src.domain.contracts.services.common.IClienteService;
import com.infotrapichao.api_manicure.src.domain.models.common.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteApplication implements IClienteApplication {

    private final IClienteService _clienteService;

    public ClienteApplication(IClienteService clienteService){
        this._clienteService = clienteService;
    }
    @Override
    public Cliente findById(Integer id) {
        return _clienteService.findById(id);
    }

    @Override
    public Cliente findByCpf(String cpf) {
        return _clienteService.findByCpf(cpf);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return _clienteService.create(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return _clienteService.update(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return _clienteService.findAll();
    }

    @Override
    public List<Cliente> findAllByFilter(ClienteDTO filter) {
        return _clienteService.findAllByFilter(filter);

    }
}
