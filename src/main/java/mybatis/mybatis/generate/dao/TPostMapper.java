package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TPost;

public interface TPostMapper {
    int insert(TPost record);

    int insertSelective(TPost record);

    TPost selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKeyWithBLOBs(TPost record);

    int updateByPrimaryKey(TPost record);
}