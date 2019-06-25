package com.karen.standardtestcloud.po;

public class Testresultvalue {
    private Integer id;

    private String tid;

    private String projectname;

    private String standardvalue;

    private String standardvalue2;

    private String ctvalue;

    private String ctvalue2;

    private String unit;

    private String state;

    private String suggest;

    private String ex1;

    private String types;

    private String typet;

    private String testvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getStandardvalue() {
        return standardvalue;
    }

    public void setStandardvalue(String standardvalue) {
        this.standardvalue = standardvalue == null ? null : standardvalue.trim();
    }

    public String getStandardvalue2() {
        return standardvalue2;
    }

    public void setStandardvalue2(String standardvalue2) {
        this.standardvalue2 = standardvalue2 == null ? null : standardvalue2.trim();
    }

    public String getCtvalue() {
        return ctvalue;
    }

    public void setCtvalue(String ctvalue) {
        this.ctvalue = ctvalue == null ? null : ctvalue.trim();
    }

    public String getCtvalue2() {
        return ctvalue2;
    }

    public void setCtvalue2(String ctvalue2) {
        this.ctvalue2 = ctvalue2 == null ? null : ctvalue2.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }

    public String getTypet() {
        return typet;
    }

    public void setTypet(String typet) {
        this.typet = typet == null ? null : typet.trim();
    }

    public String getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(String testvalue) {
        this.testvalue = testvalue == null ? null : testvalue.trim();
    }
}