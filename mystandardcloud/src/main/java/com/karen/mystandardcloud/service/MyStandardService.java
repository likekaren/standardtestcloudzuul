package com.karen.mystandardcloud.service;

import com.karen.mystandardcloud.po.StandardQueryVo;

import java.util.ArrayList;

public interface MyStandardService {
    /**
     * 查找国家标准列表
     * @param standardQueryVo
     * @return
     * @throws Exception
     */
    ArrayList findMyStandard(StandardQueryVo standardQueryVo) throws Exception;

}
