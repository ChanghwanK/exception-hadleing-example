package com.demo.exceptionhandleing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */



@AllArgsConstructor

@Getter
public class ErrorResponse {

    private int code;
    private String message;

    public static ErrorResponse of ( HttpStatus httpStatus, String message ) {
        return new ErrorResponse(httpStatus.value(), message);
    }
}
