package com.example.freemarkerdemo.entity;

public class Role {
    private Integer rid;

    private String name;

    public Role() {
    }

    public Role(Integer rid, String name) {
        this.rid = rid;
        this.name = name;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}