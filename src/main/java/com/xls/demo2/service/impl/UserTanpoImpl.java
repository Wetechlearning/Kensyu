package com.xls.demo2.service.impl;

import com.xls.demo2.entity.Tanpo;
import com.xls.demo2.mapper.UserTanpoMapper;
import com.xls.demo2.service.UserTanpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//数据库保存
@Service
public class UserTanpoImpl implements UserTanpoService {
    @Autowired
    UserTanpoMapper userTanpoMapper;
    @Override
    public void save(Tanpo tanpo) {
        userTanpoMapper.insert(tanpo);
    }



}
