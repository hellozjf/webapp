package com.hellozjf.webapp.dao;

import com.hellozjf.webapp.domain.TLoginfo;
import com.hellozjf.webapp.domain.TLoginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLoginfoMapper {
    int countByExample(TLoginfoExample example);

    int deleteByExample(TLoginfoExample example);

    int insert(TLoginfo record);

    int insertSelective(TLoginfo record);

    List<TLoginfo> selectByExample(TLoginfoExample example);

    int updateByExampleSelective(@Param("record") TLoginfo record, @Param("example") TLoginfoExample example);

    int updateByExample(@Param("record") TLoginfo record, @Param("example") TLoginfoExample example);
}