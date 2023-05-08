package com.xls.demo2.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Tanpo {
    private String tanpomono; // 担保提供物
    private String xing; // 姓（漢字）
    private String ming; // 名（漢字）
    private String sei; // セイ
    private String mei; // メイ
    private Date birth; // 出生年月
    private String age; // 年龄
    private String moshikomi ; // 担保者となる理由
    private String rentai; // 申请者关系
    private String sex; // 性别
   // private String phone; // 携帯電話
    private String job; // 職業
    private String address; // 勤務先
    private String reason; // 担保理由
    private String same; // 个人申请者と同じ
}
