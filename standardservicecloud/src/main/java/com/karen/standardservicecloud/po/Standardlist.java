package com.karen.standardservicecloud.po;

import lombok.Data;


public class Standardlist {
    private String id;

    private String sid;

    private String sname;

    private String type;

    private String itime;

    private String ctime;

    private String operation;

    private String ex1;

    private String ex2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getItime() {
        return itime;
    }

    public void setItime(String itime) {
        this.itime = itime == null ? null : itime.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2 == null ? null : ex2.trim();
    }

    @Override
    public String toString() {
        return "Standardlist{" +
                "id='" + id + '\'' +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", type='" + type + '\'' +
                ", itime='" + itime + '\'' +
                ", ctime='" + ctime + '\'' +
                ", operation='" + operation + '\'' +
                ", ex1='" + ex1 + '\'' +
                ", ex2='" + ex2 + '\'' +
                '}';
    }
}