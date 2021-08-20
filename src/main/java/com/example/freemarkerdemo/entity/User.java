package com.example.freemarkerdemo.entity;

import com.example.freemarkerdemo.uitl.Page;

public class User extends Page {
    private Integer uid;

    private String uname;

    private Integer rid;

   private  Role role;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(Integer uid, String uname, Integer rid, Role role) {
        this.uid = uid;
        this.uname = uname;
        this.rid = rid;
        this.role = role;
    }

    public User() {
    }
}
