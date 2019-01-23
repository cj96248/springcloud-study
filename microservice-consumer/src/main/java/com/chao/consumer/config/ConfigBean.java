package com.chao.consumer.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableEurekaClient
public class ConfigBean {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
