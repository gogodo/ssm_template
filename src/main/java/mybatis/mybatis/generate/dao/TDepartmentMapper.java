package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TDepartment;

public interface TDepartmentMapper {
    int insert(TDepartment record);

    int insertSelective(TDepartment record);

    TDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDepartment record);

    int updateByPrimaryKey(TDepartment record);
}