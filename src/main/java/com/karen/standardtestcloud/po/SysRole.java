package com.karen.standardtestcloud.po;

public class SysRole {
    private String id;

    private String name;

    private String available;

    private String roledescribe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }

    public String getRoledescribe() {
        return roledescribe;
    }

    public void setRoledescribe(String roledescribe) {
        this.roledescribe = roledescribe == null ? null : roledescribe.trim();
    }
}