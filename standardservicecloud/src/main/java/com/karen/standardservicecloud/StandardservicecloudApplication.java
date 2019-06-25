package com.karen.standardservicecloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.karen.standardservicecloud.mapper")
public class StandardservicecloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(StandardservicecloudApplication.class, args);
    }

}
