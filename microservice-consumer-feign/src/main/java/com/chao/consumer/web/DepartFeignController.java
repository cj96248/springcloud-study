package com.chao.consumer.web;

import com.chao.consumer.service.GitHubFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer-feign")
public class DepartFeignController {

    @Autowired
    private GitHubFeignService gitHubFeignService;

    @GetMapping("/github/query")
    public String queryRepo(String qstr){
        return gitHubFeignService.searchRepo(qstr);
    }
}
