package com.example.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class WebdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebdemoApplication.class, args);
    }

}
