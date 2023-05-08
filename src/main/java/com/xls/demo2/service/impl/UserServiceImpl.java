package com.xls.demo2.service.impl;


import com.xls.demo2.entity.User;
import com.xls.demo2.mapper.UserMapper;
import com.xls.demo2.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//数据库保存
@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}

