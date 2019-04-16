package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TLoginLog;

public interface TLoginLogMapper {
    int insert(TLoginLog record);

    int insertSelective(TLoginLog record);

    TLoginLog selectByPrimaryKey(Integer loginLogId);

    int updateByPrimaryKeySelective(TLoginLog record);

    int updateByPrimaryKey(TLoginLog record);
}