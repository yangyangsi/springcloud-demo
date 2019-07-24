package com.hand.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args){
        SpringApplication.run(StudentApplication.class,args);
    }
}
