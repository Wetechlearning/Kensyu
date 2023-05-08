package com.xls.demo2.Controller;

import com.xls.demo2.entity.User;
import com.xls.demo2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class UserController {




    //在控制层注入业务层
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("add")     //设置方法的请求路径　
    public ResponseEntity<?> createUser(HttpServletRequest request, @RequestBody User user) {

        //判断输入框的值是否为空值
//        HttpSession session = request.getSession();
//
//        session.setAttribute("name",user.getXing());

        if (user.getXing()== null || user.getXing().isEmpty()) {
            return ResponseEntity.badRequest().body("姓（漢字）を入力してください。");
        }
        if (user.getMing()== null || user.getMing().isEmpty()) {
            return ResponseEntity.badRequest().body("名（漢字）を入力してください。");
        }
        if (user.getSei()== null || user.getSei().isEmpty()) {
            return ResponseEntity.badRequest().body("セイを入力してください。");
        }
        if (user.getMei()== null || user.getMei().isEmpty()) {
            return ResponseEntity.badRequest().body("メイを入力してください。");
        }
        if (user.getRomasei()== null || user.getRomasei().isEmpty()) {
            return ResponseEntity.badRequest().body("姓（ローマ字）を入力してください。");
        }
        if (user.getRomamei()== null || user.getRomamei().isEmpty()) {
            return ResponseEntity.badRequest().body("名（ローマ字）を入力してください。");
        }
        if (user.getCountry()== null || user.getCountry().isEmpty()) {
            return ResponseEntity.badRequest().body("国籍を選択してください。");
        }
        if (user.getSex()== null || user.getSex().isEmpty()) {
            return ResponseEntity.badRequest().body("性別を選んでください。");
        }
        if (user.getBirth() == null) {
            return ResponseEntity.badRequest().body("生年月日を入力してください。");
        }
        if (user.getTel()== null || user.getTel().isEmpty()) {
            return ResponseEntity.badRequest().body("電話番号を入力してください。");
        }

        if (user.getPhone()== null || user.getPhone().isEmpty()) {
            return ResponseEntity.badRequest().body("電話番号を入力してください。");
        }
        if (user.getJob()== null || user.getJob().isEmpty()) {
            return ResponseEntity.badRequest().body("職業を選んでください。");
        }


        // 所有信息都正确的话就传输到数据库

        userServiceImpl.save(user);
        return ResponseEntity.ok("保存成功");}
}
