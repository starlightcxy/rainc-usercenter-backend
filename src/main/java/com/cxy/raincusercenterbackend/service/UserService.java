package com.cxy.raincusercenterbackend.service;

import com.cxy.raincusercenterbackend.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *用户服务
 *
 * @author cxy
 */
public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
