package com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.security;

import com.infotrapichao.api_manicure.src.domain.models.security.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {

    private String login;
    private String token;
    private User user;
}
