package com.example.freemarkerdemo.dao;

import com.example.freemarkerdemo.entity.User;
import com.example.freemarkerdemo.entity.User;

import java.util.List;

public interface UserMapper {


    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);




    int updateByPrimaryKey(User record);
    List<User> selectall(User user);
    int deleteByPrimaryKey(Integer uid);
    User selectone(Integer uid);
    int insert(User record);
    int count(User user);

    void deleteall(List<Integer> idlist);
}
