package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TBoard;

public interface TBoardMapper {
    int insert(TBoard record);

    int insertSelective(TBoard record);

    TBoard selectByPrimaryKey(Integer boardId);

    int updateByPrimaryKeySelective(TBoard record);

    int updateByPrimaryKey(TBoard record);
}