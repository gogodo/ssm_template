package com.jun.ssm_template.repository;

import com.jun.ssm_template.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentDao {

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
