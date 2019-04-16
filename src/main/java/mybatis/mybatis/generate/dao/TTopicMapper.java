package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TTopic;

public interface TTopicMapper {
    int insert(TTopic record);

    int insertSelective(TTopic record);

    TTopic selectByPrimaryKey(Integer topicId);

    int updateByPrimaryKeySelective(TTopic record);

    int updateByPrimaryKey(TTopic record);
}