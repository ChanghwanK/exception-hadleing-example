package com.demo.exceptionhandleing.handler;

import com.demo.exceptionhandleing.dto.ErrorResponse;
import com.demo.exceptionhandleing.exception.AlreadyExistEmailException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler (AlreadyExistEmailException.class)
    public ErrorResponse handleAlreadyExistEmail(AlreadyExistEmailException ex) {
        return ErrorResponse.of(HttpStatus.BAD_REQUEST, ex.getMessage());
    }
}
