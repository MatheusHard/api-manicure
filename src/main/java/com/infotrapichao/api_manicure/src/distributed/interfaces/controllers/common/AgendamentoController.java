package com.infotrapichao.api_manicure.src.distributed.interfaces.controllers.common;

import com.infotrapichao.api_manicure.src.application.contracts.common.IAgendamentoApplication;
import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.AgendamentoDTO;
import com.infotrapichao.api_manicure.src.distributed.interfaces.mappers.AgendamentoMapper;
import com.infotrapichao.api_manicure.src.domain.models.common.Agendamento;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("agendamentos")
public class AgendamentoController {

    private final IAgendamentoApplication _agendamentoApplication;

    public AgendamentoController(IAgendamentoApplication agendamentoApplication){
        this._agendamentoApplication = agendamentoApplication;
    }

    @PostMapping
    public ResponseEntity<Agendamento> create(@Validated @RequestBody AgendamentoDTO agendamentoDTO){

        Agendamento agendamento = AgendamentoMapper.toAgendamento(agendamentoDTO);
        var agendamentoCreated = _agendamentoApplication.create(agendamento);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(agendamentoCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(agendamentoCreated);
    }

    @PutMapping()
    public ResponseEntity<Agendamento> put(@RequestBody AgendamentoDTO agendamentoDTO){

        Agendamento agendamento = AgendamentoMapper.toAgendamento(agendamentoDTO);
        var agendamentoUpdated = _agendamentoApplication.update(agendamento);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(agendamentoUpdated.getId())
                .toUri();
        return ResponseEntity.created(location).body(agendamentoUpdated);
    }

    @GetMapping()
    public ResponseEntity<List<AgendamentoDTO>> findAll(){
        var lista = AgendamentoMapper.toAgendamentoDTOList(_agendamentoApplication.findAll());
        return ResponseEntity.ok(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> findById(@PathVariable("id") Integer id){
        var agendamento = _agendamentoApplication.findById(id);
        return ResponseEntity.ok(agendamento);
    }
    @PostMapping("/filtrar")
    public ResponseEntity<List<AgendamentoDTO>> filtrar(@RequestBody AgendamentoDTO filter) {
        var agendamentos = _agendamentoApplication.findAllByFilter(filter);
        var lista = AgendamentoMapper.toAgendamentoDTOList(agendamentos);
        return ResponseEntity.ok(lista);
    }

}

