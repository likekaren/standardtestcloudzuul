package com.karen.standardservicecloud.mapper;


import com.karen.standardservicecloud.po.StandardQueryVo;
import com.karen.standardservicecloud.po.StandardlistCustom;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface StandardlistMapperCustom {
	// 商品查询列表
			public ArrayList findStandardList(StandardQueryVo standardQueryVo)
					throws Exception;
			ArrayList findStandardStr(String str) throws Exception;
}
