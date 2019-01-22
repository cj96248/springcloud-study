package com.chao.provider.service.impl;

import com.chao.common.entity.Department;
import com.chao.provider.dao.DepartmentDao;
import com.chao.provider.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public boolean add(Department department) {
        System.out.println(department);
        return departmentDao.addDepartment(department);
    }

    @Override
    public Department get(Integer id) {
        return departmentDao.findById(id);
    }

    @Override
    public List<Department> list() {
        return departmentDao.findAll();
    }
}
