package com.example.freemarkerdemo.service;

import com.example.freemarkerdemo.dao.UserMapper;
import com.example.freemarkerdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public int updateByPrimaryKey(User record) {
        return  userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectall(User user) {
        return userMapper.selectall(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public User selectone(Integer uid) {
        return userMapper.selectone(uid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int count(User user) {
        return userMapper.count(user);
    }

    @Override
    public void deleteall(String ids) {
        List<Integer> idlist= new ArrayList<Integer>();
        String[] idarr = ids.split(",");
        for (String id : idarr) {
            idlist.add(Integer.parseInt(id));
        }
        userMapper.deleteall(idlist);
    }
}
