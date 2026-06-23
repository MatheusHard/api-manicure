package com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.security;

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
public class UserDTO {

    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String username;
    private String email;
    private String password;
    private List<String> roles;

}
