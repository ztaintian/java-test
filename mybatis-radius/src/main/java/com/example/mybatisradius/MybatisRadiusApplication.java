package com.example.mybatisradius;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisradius.mybatis.mapper")
public class MybatisRadiusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisRadiusApplication.class, args);
    }

}
