package com.example.freemarkerdemo.service;

import com.example.freemarkerdemo.entity.User;

import java.util.List;

public interface UserService {

    int updateByPrimaryKey(User record);
    List<User> selectall(User user);
    int deleteByPrimaryKey(Integer uid);
    User selectone(Integer uid);
    int insert(User record);
    int count(User user);

    void deleteall(String ids);
}
