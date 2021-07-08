package com.demo.exceptionhandleing.dto;

import com.demo.exceptionhandleing.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Created by Bloo
 * @Date: 2021/07/08
 */


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class SignupReqDto {

    private String email;
    private String password;
    private String nickName;

    public User toEntity() {
        return User.builder()
            .email(email)
            .password(password)
            .nickName(nickName)
            .build();
    }
}
