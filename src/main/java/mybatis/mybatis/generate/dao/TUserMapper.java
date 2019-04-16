package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TUser;

public interface TUserMapper {
    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}