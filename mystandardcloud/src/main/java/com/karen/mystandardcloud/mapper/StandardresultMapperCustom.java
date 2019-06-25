package com.karen.mystandardcloud.mapper;


import com.karen.mystandardcloud.po.StandardQueryVo;
import com.karen.mystandardcloud.po.StandardresultCustom;

import java.util.ArrayList;
import java.util.List;

public interface StandardresultMapperCustom {
	// 自定义标准查询
			public ArrayList findStandardresult(StandardQueryVo standardQueryVo) throws Exception;
	//添加符合性测试表

			public List<StandardresultCustom> addstandardresult(String tid)throws Exception;
			public List<StandardresultCustom> addstandardresultvalue(String tid)throws Exception;
			public Integer findmaxid()throws Exception;
}
