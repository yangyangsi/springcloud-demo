package com.hand.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class TeacherServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(TeacherServiceApplication.class,args);
    }
}
