package com.infotrapichao.api_manicure.src.distributed.interfaces.mappers;

import com.infotrapichao.api_manicure.src.distributed.interfaces.dtos.security.UserDTO;
import com.infotrapichao.api_manicure.src.domain.models.security.User;

import java.util.List;

public final class UserMapper {

    private UserMapper() {
    }

    public static UserDTO toUserDTO(User user) {
        if (user == null) {
            return null;
        }

        return new UserDTO(
                user.getId(),
                user.getCreatedAt(),
                user.getUpdatedAt(),
                user.getUsername(),
                user.getEmail(),
                null, // Nunca retornar a senha
                user.getRoles(),
                null,
                null
        );
    }

    public static User toUser(UserDTO dto) {
        if (dto == null) {
            return null;
        }

        return new User(
                dto.getId(),
                dto.getCreatedAt(),
                dto.getUpdatedAt(),
                dto.getUsername(),
                dto.getEmail(),
                dto.getPassword(),
                null,
                null,
                dto.getRoles()
        );
    }

    public static List<UserDTO> toUserDTOList(List<User> users) {
        if (users == null || users.isEmpty()) {
            return List.of();
        }

        return users.stream()
                .map(UserMapper::toUserDTO)
                .toList();
    }

    public static List<User> toUserList(List<UserDTO> dtos) {
        if (dtos == null || dtos.isEmpty()) {
            return List.of();
        }

        return dtos.stream()
                .map(UserMapper::toUser)
                .toList();
    }
}