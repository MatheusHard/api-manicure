package com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common;

import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.security.UserDTO;
import com.infotrapichao.api_manicure.src.domain.models.common.Agendamento;
import com.infotrapichao.api_manicure.src.domain.models.security.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String name;
    private String cpf;
    private String email;
    private String telephone;
    private UserDTO user;
    private List<AgendamentoDTO> agendamentos;
    private Boolean deletado = false;
    private String photoName;
    private String imagemBase64;

    }
