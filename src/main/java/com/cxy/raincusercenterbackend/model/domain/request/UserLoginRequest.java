package com.cxy.raincusercenterbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author cxy
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 438817115755537457L;

    private String userAccount;

    private String userPassword;

}
