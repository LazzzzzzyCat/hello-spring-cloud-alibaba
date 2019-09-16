package com.example.spring.cloud.alibaba.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author huwj
 * @date 2019-09-16 10:57
 */
@Configuration
public class ProviderConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
