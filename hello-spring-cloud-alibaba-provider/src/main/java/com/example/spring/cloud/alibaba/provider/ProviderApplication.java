package com.example.spring.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * service provider
 * @author huwj
 * @date 2019-09-15 22:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class, args);
    }
}
