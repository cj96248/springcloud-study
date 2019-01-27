package com.chao.provider.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoverController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/service")
    public String getInfo(){
        List<String> services = client.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = client.getInstances("microservice-provider");
        return instances.toString();
    }
}
