package com.xls.demo2.mapper;


import com.xls.demo2.entity.Tanpo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTanpoMapper {
//    @Insert("INSERT INTO user2" +
//        "(tanpomono,xing,ming,sei,mei,birth,age,bmoushikomi,rentai,sex,phone,job,address,reaspn,same)" +
//        " VALUES" +
//        "(#{tanpomono},#{xing},#{ming},#{sei},#{mei},#{birth},#{age},#{moushikomi},#{rentai}," +
//        "#{sex},#{phone},#{job},#{address},#{reason},#{some})")
//
//void insert(Tanpo tanpo);

    @Insert("INSERT INTO user2" +
            "(tanpomono,xing,ming,sei,mei,birth,age,bmoushikomi,rentai,sex,job,address,reaspn,same)" +
            " VALUES" +
            "(#{tanpomono},#{xing},#{ming},#{sei},#{mei},#{birth},#{age},#{moushikomi},#{rentai}," +
            "#{sex},#{job},#{address},#{reason},#{some})")

    void insert(Tanpo tanpo);
}
