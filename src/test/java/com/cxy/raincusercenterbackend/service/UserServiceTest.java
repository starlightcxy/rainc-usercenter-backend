package com.cxy.raincusercenterbackend.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;
    //
    // @Test
    // public void testAddUser(){
    //     User user = new User();
    //     user.setUsername("cxy");
    //     user.setUserAccount("123");
    //     user.setAvatarUrl("1");
    //     user.setGender((byte)0);
    //     user.setUserPassword("xxx");
    //     user.setPhone("123");
    //     user.setEmail("123");
    //     boolean result = userService.save(user);
    //     System.out.println(user.getId());
    //     assertTrue(result);
    // }

    @Test
    void userRegister() {
        String userAccount = "cxyu";
        String userPassword = "";
        String checkPassword = "12345678";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "cxy";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "chaixiayu";
        userPassword = "1";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "cxy cxy";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "chaixiayu";
        checkPassword = "123444444";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "cxycxy";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
        userAccount = "chaixiayu";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        System.out.println(result);
        Assertions.assertTrue(result > 0);
        // Assertions.assertEquals(-1,result);
    }
}