package com.jun.ssm_template.servers;


import com.jun.ssm_template.entities.Department;

import java.util.List;

/**
 * 部门服务
 */
public interface DepartmentServer {
    /**
     * 查找一个
     * @param id
     * @return
     */
    public Department findById(Integer id );

    /**
     * 查找全部
     * @return
     */
    public List<Department> findAll();

}
