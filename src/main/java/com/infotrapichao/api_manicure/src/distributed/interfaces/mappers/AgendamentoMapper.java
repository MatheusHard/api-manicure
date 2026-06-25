package com.infotrapichao.api_manicure.src.distributed.interfaces.mappers;

import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.AgendamentoDTO;
import com.infotrapichao.api_manicure.src.domain.models.common.Agendamento;

import java.util.List;

public final class AgendamentoMapper {

    private AgendamentoMapper() {
    }

    public static AgendamentoDTO toAgendamentoDTO(Agendamento agendamento) {
        if (agendamento == null) {
            return null;
        }

        return new AgendamentoDTO(
                agendamento.getId(),
                agendamento.getCreatedAt(),
                agendamento.getUpdatedAt(),
                agendamento.getFinalizado(),
                UserMapper.toUserDTO(agendamento.getUser()),
                ClienteMapper.toClienteDTO(agendamento.getCliente()),
                agendamento.getObservacao(),
                agendamento.getDeletado(),
                null,
                null,
                agendamento.getDataAtendimento()
        );
    }

    public static Agendamento toAgendamento(AgendamentoDTO dto) {
        if (dto == null) {
            return null;
        }

        return new Agendamento(
                dto.getId(),
                dto.getCreatedAt(),
                dto.getUpdatedAt(),
                dto.getFinalizado(),
                UserMapper.toUser(dto.getUser()),
                ClienteMapper.toCliente(dto.getCliente()),
                dto.getObservacao(),
                dto.getDeletado(),
                dto.getDataAtendimento()
        );
    }

    public static List<AgendamentoDTO> toAgendamentoDTOList(List<Agendamento> agendamentos) {
        return agendamentos == null
                ? List.of()
                : agendamentos.stream()
                .map(AgendamentoMapper::toAgendamentoDTO)
                .toList();
    }

    public static List<Agendamento> toAgendamentoList(List<AgendamentoDTO> dtos) {
        return dtos == null
                ? List.of()
                : dtos.stream()
                .map(AgendamentoMapper::toAgendamento)
                .toList();
    }
}