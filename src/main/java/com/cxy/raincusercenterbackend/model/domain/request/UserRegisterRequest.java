package com.cxy.raincusercenterbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author cxy
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -5130602103745012382L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
