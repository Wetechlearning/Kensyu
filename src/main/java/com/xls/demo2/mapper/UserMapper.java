package com.xls.demo2.mapper;

import com.xls.demo2.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user" +
            "(xing,ming,sei,mei,romasei,romamei,country,sex,birth,tel,phone,job,address)" +
            " VALUES" +
            "(#{xing},#{ming},#{sei},#{mei},#{romasei},#{romamei},#{country},#{sex},#{birth}," +
            "#{tel},#{phone},#{job},#{address})")
    void insert(User user);


}