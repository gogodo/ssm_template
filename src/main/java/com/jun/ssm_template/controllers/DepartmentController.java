package com.jun.ssm_template.controllers;

import com.jun.ssm_template.entities.Department;
import com.jun.ssm_template.servers.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServer departmentServer;

    /**
     * 获得指定部门数据
     *
     * @param id
     * @return
     */
    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        Department department = departmentServer.findById(id);
        return department;
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        List<Department> departments = departmentServer.findAll();
        return departments;
    }
}
