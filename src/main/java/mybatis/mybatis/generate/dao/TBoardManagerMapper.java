package mybatis.mybatis.generate.dao;

import mybatis.mybatis.generate.po.TBoardManagerKey;

public interface TBoardManagerMapper {
    int insert(TBoardManagerKey record);

    int insertSelective(TBoardManagerKey record);
}