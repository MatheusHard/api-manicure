package com.infotrapichao.api_manicure.src.application.services.common;

import com.infotrapichao.api_manicure.src.application.contracts.common.IAgendamentoApplication;
import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.AgendamentoDTO;
import com.infotrapichao.api_manicure.src.domain.contracts.services.common.IAgendamentoService;
import com.infotrapichao.api_manicure.src.domain.models.common.Agendamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoApplication implements IAgendamentoApplication {

    private final IAgendamentoService _agendamentoService;

    public AgendamentoApplication(IAgendamentoService agendamentoService){
        this._agendamentoService = agendamentoService;
    }

    @Override
    public Agendamento findById(Integer id) {
        return _agendamentoService.findById(id);
    }

    @Override
    public Agendamento create(Agendamento agendamento) {
        return _agendamentoService.create(agendamento);
    }

    @Override
    public Agendamento update(Agendamento agendamento) {
        return _agendamentoService.update(agendamento);
    }

    @Override
    public List<Agendamento> findAll() {
        return _agendamentoService.findAll();
    }

    @Override
    public List<Agendamento> findAllByFilter(AgendamentoDTO filter) {
        return _agendamentoService.findAllByFilter(filter);
    }
}
