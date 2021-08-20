package com.example.freemarkerdemo.service;

import com.example.freemarkerdemo.dao.RoleMapper;
import com.example.freemarkerdemo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements  RoleService{
    @Autowired
    private RoleMapper RoleMapper;

    @Override
    public List<Role> selectrole() {
        return RoleMapper.selectrole();
    }
}
