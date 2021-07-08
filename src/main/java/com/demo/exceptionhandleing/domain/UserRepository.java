package com.demo.exceptionhandleing.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail ( String email );
}
