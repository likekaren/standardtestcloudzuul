package com.karen.standardservicecloud.po;

import lombok.Data;

public class StandardlistCustom extends Standardlist{

    @Override
    public String toString() {
//        return super.getId();//可以拿到id
//        return super.toString();//正常
//        return this.getId(); //可以拿到id
        return  this.toString();//无限递归，内存溢出错误

    }

}
