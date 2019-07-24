package com.hand.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class CustomerServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(CustomerServiceApplication.class,args);
    }
}
