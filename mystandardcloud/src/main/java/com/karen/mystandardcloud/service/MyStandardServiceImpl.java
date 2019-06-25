package com.karen.mystandardcloud.service;

import com.karen.mystandardcloud.mapper.StandardresultMapperCustom;
import com.karen.mystandardcloud.po.StandardQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author LIKE
 * @date 2019/6/25 10:49
 */
@Service
public class MyStandardServiceImpl implements MyStandardService{
    @Autowired(required=false)
    private StandardresultMapperCustom standardresultMapperCustom;

    @Override
    public ArrayList findMyStandard(StandardQueryVo standardQueryVo) throws Exception {
        return standardresultMapperCustom.findStandardresult(standardQueryVo);
    }
}
