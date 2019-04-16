package com.jun.ssm_template.servers.impl;

import com.jun.ssm_template.entities.Department;
import com.jun.ssm_template.repository.DepartmentDao;
import com.jun.ssm_template.servers.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServerImpl implements DepartmentServer {

    @Autowired
    private DepartmentDao departmentDao;


    @Override
    public Department findById(Integer id ){
        Department department = departmentDao.findById(id);
        return department;
    }

    @Override
    public List<Department> findAll() {
        List<Department> departments = departmentDao.findAll();
        return departments;
    }

}
