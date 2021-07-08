package com.demo.exceptionhandleing.service;

import com.demo.exceptionhandleing.domain.User;
import com.demo.exceptionhandleing.domain.UserRepository;
import com.demo.exceptionhandleing.dto.SignupReqDto;
import com.demo.exceptionhandleing.exception.AlreadyExistEmailException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */


@RequiredArgsConstructor
@Service
public class ApiUserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUp ( SignupReqDto signupReqDto ) {
        String email = signupReqDto.getEmail();

        Optional<User> user = userRepository.findByEmail(email);
        if ( user.isEmpty() ) {
            userRepository.save(signupReqDto.toEntity());
        } else {
            throw new AlreadyExistEmailException();
        }

    }
}
