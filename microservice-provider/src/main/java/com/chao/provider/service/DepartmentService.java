package com.chao.provider.service;

import com.chao.common.entity.Department;

import java.util.List;

public interface DepartmentService {
    boolean add(Department department);

    Department get(Integer id);

    List<Department> list();

}
