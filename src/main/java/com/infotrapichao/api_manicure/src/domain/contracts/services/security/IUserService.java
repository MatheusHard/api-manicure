package com.infotrapichao.api_manicure.src.domain.contracts.services.security;

import com.infotrapichao.api_manicure.src.domain.models.security.User;

import java.util.List;

public interface IUserService {

    User findById(Integer id);
    User createUser(User user);
    User updateUser(User user);
    List<User> findAll();
    User findByUsername(String username);
}
