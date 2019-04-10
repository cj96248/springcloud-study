package com.chao.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="github-client", url="https://api.github.com" )
public interface GitHubFeignService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchRepo(@RequestParam("q") String queryStr);
}
