package com.karen.standardservicecloud.mapper;


import com.karen.standardservicecloud.po.Standardlist;
import com.karen.standardservicecloud.po.StandardlistExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StandardlistMapper {
    int countByExample(StandardlistExample example);

    int deleteByExample(StandardlistExample example);

    int deleteByPrimaryKey(String id);

    int insert(Standardlist record);

    int insertSelective(Standardlist record);

    List<Standardlist> selectByExample(StandardlistExample example);

    Standardlist selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Standardlist record, @Param("example") StandardlistExample example);

    int updateByExample(@Param("record") Standardlist record, @Param("example") StandardlistExample example);

    int updateByPrimaryKeySelective(Standardlist record);

    int updateByPrimaryKey(Standardlist record);
}