package com.chao.provider.web;

import com.chao.common.entity.Department;
import com.chao.provider.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department get(@PathVariable Integer id){
        return departmentService.get(id);
    }
    @GetMapping("/list")
    public List<Department> list(){
        return departmentService.list();
    }

    @PostMapping("/save")
    public boolean save(Department department){
        return departmentService.add(department);
    }
}
