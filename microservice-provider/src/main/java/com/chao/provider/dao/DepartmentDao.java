package com.chao.provider.dao;

import com.chao.common.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentDao {
    boolean addDepartment(Department department);

    Department findById(@Param("id") Integer id);

    List<Department> findAll();
}
