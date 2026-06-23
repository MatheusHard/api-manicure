package com.infotrapichao.api_manicure.src.infrastruture.repositories.security;

import com.infotrapichao.api_manicure.src.domain.models.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Query Method
    // List<User> findByNameContaining(String name);

    // Query Method
    User findByUsername(String username);

    // Query Override
    // @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username=
    // (:username)")
    // List<User> findByUserName(@Param("username") String username);

    boolean existsByUsername(String username);
}
