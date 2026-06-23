package com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDTO {

    private String descricao;
    private String nomeUsuario;
    private String nomeCliente;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime dataAtendimento;
    private String remetente;
    private String destinatario;
    private String assunto;
    private String corpo;
    private ClienteDTO cliente;

}
