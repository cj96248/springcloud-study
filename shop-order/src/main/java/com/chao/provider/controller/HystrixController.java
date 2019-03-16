package com.chao.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    public String getProductInfoList(){
        RestTemplate restTemplate = new RestTemplate();
        return null;
    }
}
