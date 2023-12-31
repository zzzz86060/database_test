package com.zz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zz.mapper")
public class EeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EeApplication.class, args);
    }


}
