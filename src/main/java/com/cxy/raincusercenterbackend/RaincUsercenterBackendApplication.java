package com.cxy.raincusercenterbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxy.raincusercenterbackend.mapper")
public class RaincUsercenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaincUsercenterBackendApplication.class, args);
    }

}
