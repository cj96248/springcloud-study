package com.chao.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProductApp.class, args);
    }
}
