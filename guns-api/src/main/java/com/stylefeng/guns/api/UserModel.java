package com.stylefeng.guns.api;

import lombok.Data;

import java.io.Serializable;

/**
 *主要用于用户注册和登录
 */
@Data
public class UserModel implements Serializable {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
}
