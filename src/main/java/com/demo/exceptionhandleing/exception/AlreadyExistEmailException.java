package com.demo.exceptionhandleing.exception;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */

public class AlreadyExistEmailException extends RuntimeException {
    private static final String MESSAGE = "이미 등록된 이메일 입니다.";
    public AlreadyExistEmailException () {
        super(MESSAGE);
    }
}






