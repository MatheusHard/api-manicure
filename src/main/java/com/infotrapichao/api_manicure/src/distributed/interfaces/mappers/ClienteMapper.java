package com.infotrapichao.api_manicure.src.distributed.interfaces.mappers;

import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common.ClienteDTO;
import com.infotrapichao.api_manicure.src.domain.models.common.Cliente;

import java.util.List;

public final class ClienteMapper {

    private ClienteMapper() {
    }

    public static ClienteDTO toClienteDTO(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        return new ClienteDTO(
                cliente.getId(),
                cliente.getCreatedAt(),
                cliente.getUpdatedAt(),
                cliente.getName(),
                cliente.getCpf(),
                cliente.getEmail(),
                cliente.getTelephone(),
                UserMapper.toUserDTO(cliente.getUser()),
                List.of(),
                cliente.getDeletado(),
                cliente.getPhotoName(),
                cliente.getImagemBase64()
        );
    }

    public static Cliente toCliente(ClienteDTO dto) {
        if (dto == null) {
            return null;
        }

        return new Cliente(
                dto.getId(),
                dto.getCreatedAt(),
                dto.getUpdatedAt(),
                dto.getName(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getTelephone(),
                UserMapper.toUser(dto.getUser()),
                AgendamentoMapper.toAgendamentoList(dto.getAgendamentos()),
                dto.getDeletado(),
                dto.getPhotoName(),
                dto.getImagemBase64()
        );
    }

    public static List<ClienteDTO> toClienteDTOList(List<Cliente> clientes) {
        if (clientes == null || clientes.isEmpty()) {
            return List.of();
        }

        return clientes.stream()
                .map(ClienteMapper::toClienteDTO)
                .toList();
    }

    public static List<Cliente> toClienteList(List<ClienteDTO> dtos) {
        if (dtos == null || dtos.isEmpty()) {
            return List.of();
        }

        return dtos.stream()
                .map(ClienteMapper::toCliente)
                .toList();
    }
}