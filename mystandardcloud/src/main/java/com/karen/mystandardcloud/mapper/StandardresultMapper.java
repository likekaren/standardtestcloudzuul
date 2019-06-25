package com.karen.mystandardcloud.mapper;


import com.karen.mystandardcloud.po.Standardresult;
import com.karen.mystandardcloud.po.StandardresultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StandardresultMapper {
    int countByExample(StandardresultExample example);

    int deleteByExample(StandardresultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Standardresult record);

    int insertSelective(Standardresult record);

    List<Standardresult> selectByExample(StandardresultExample example);

    Standardresult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Standardresult record, @Param("example") StandardresultExample example);

    int updateByExample(@Param("record") Standardresult record, @Param("example") StandardresultExample example);

    int updateByPrimaryKeySelective(Standardresult record);

    int updateByPrimaryKey(Standardresult record);
}