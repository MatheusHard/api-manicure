package com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.common;

import com.infotrapichao.api_manicure.src.domain.models.common.Cliente;
import com.infotrapichao.api_manicure.src.domain.models.security.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgendamentoDTO {
    
    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean finalizado;
    private User user;
    private Cliente cliente;
    private String observacao;
    private Boolean deletado = false;

    ///Filters
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private LocalDateTime dataAtendimento;
}
