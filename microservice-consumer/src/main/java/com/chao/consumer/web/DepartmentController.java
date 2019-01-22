package com.chao.consumer.web;

import com.chao.common.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DepartmentController {

    private static final String URL_PREFIX = "http://localhost:8001/provider/department";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(Department dept){
        String url = URL_PREFIX + "/save";
        return restTemplate.postForObject(url, dept, Boolean.class);
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Integer id){
        String url = URL_PREFIX + "/" + id;
        return restTemplate.getForObject(url, Department.class);
    }
    @GetMapping("/list")
    public List<Department> get(){
        String url = URL_PREFIX + "/list";
        return restTemplate.getForObject(url, List.class);
    }


}
