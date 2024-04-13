package com.cxy.raincusercenterbackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class RaincUsercenterBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDegist() throws NoSuchAlgorithmException {
        // MessageDigest md5 = MessageDigest.getInstance("MD5");
        // byte[] bytes = md5.digest("abcd".getBytes(StandardCharsets.UTF_8));
        // String result = new String(bytes);
        // System.out.println(result);

        String newPassword = DigestUtils.md5DigestAsHex(("ab" + "mypassword").getBytes());
        System.out.println(newPassword);
    }

}
