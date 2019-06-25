package com.karen.standardtestcloud.po;

public class Carjsz {
    private String id;

    private String sfid;

    private String name;

    private String sex;

    private String nationality;

    private String address;

    private String birthday;

    private String fgz;

    private String zjtype;

    private String sdate;

    private String edate;

    private String ex1;
    
    private String ex2;

    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getFgz() {
        return fgz;
    }

    public void setFgz(String fgz) {
        this.fgz = fgz == null ? null : fgz.trim();
    }

    public String getZjtype() {
        return zjtype;
    }

    public void setZjtype(String zjtype) {
        this.zjtype = zjtype == null ? null : zjtype.trim();
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate == null ? null : sdate.trim();
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate == null ? null : edate.trim();
    }

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1 == null ? null : ex1.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

	public String getEx2() {
		return ex2;
	}

	 public void setEx2(String ex2) {
	        this.ex2 = ex2 == null ? null : ex2.trim();
	    }
}