package com.demo.exceptionhandleing.controller;

import com.demo.exceptionhandleing.dto.SignupReqDto;
import com.demo.exceptionhandleing.exception.AlreadyExistEmailException;
import com.demo.exceptionhandleing.service.ApiUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */


@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
@RestController
public class ApiUserController {

    private final ApiUserService userService;

    @PostMapping("")
    public ResponseEntity<Void> signUp(@RequestBody SignupReqDto signupReqDto ) {
        userService.signUp(signupReqDto);
        return ResponseEntity.ok().build();
    }
}
