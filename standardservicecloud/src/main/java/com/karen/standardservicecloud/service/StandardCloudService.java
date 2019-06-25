package com.karen.standardservicecloud.service;


import com.karen.standardservicecloud.po.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public interface StandardCloudService {
	//标准查询列表
	ArrayList findStandardList(StandardQueryVo standardQueryVo) throws Exception;
//	List<StandardlistCustom> findStandardList(String str)
//			throws Exception;
}