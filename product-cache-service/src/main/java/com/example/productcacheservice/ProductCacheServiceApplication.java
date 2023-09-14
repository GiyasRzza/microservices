package com.example.productcacheservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;


@SpringBootApplication
@ImportAutoConfiguration(FeignAutoConfiguration.class)
//@EnableDiscoveryClient
@EnableFeignClients
public class ProductCacheServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductCacheServiceApplication.class, args);
    }

}
