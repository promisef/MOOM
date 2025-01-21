package com.momo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.momo.clients")
public class UserApplication {

    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }

     public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
