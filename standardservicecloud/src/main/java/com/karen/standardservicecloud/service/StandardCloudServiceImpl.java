package com.karen.standardservicecloud.service;

import java.util.ArrayList;

import com.karen.standardservicecloud.mapper.*;
import com.karen.standardservicecloud.po.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class StandardCloudServiceImpl implements StandardCloudService {
	
	//注入mapper
	@Autowired(required=false)
	private StandardlistMapperCustom standardlistMapperCustom;


	//标准查询列表
	@Override
	public ArrayList findStandardList(StandardQueryVo standardQueryVo) throws Exception {
		return standardlistMapperCustom.findStandardList(standardQueryVo);

	}


}
