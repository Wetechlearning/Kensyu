package com.xls.demo2.Controller;
import com.xls.demo2.entity.Tanpo;
import com.xls.demo2.service.impl.UserTanpoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tests")
public class UsertanpoController { //在控制层注入业务层
    @Autowired
    private UserTanpoImpl userTanpoImpl;
    @PostMapping("tan")     //设置方法的请求路径　
    public ResponseEntity<?> createTanpo(@RequestBody  Tanpo tanpo) {

        if (tanpo.getXing()== null || tanpo.getXing().isEmpty()) {
            return ResponseEntity.badRequest().body("姓（漢字）を入力してください。");
        }
        if (tanpo.getMing()== null || tanpo.getMing().isEmpty()) {
            return ResponseEntity.badRequest().body("名（漢字）を入力してください。");
        }
        if (tanpo.getSei()== null || tanpo.getSei().isEmpty()) {
            return ResponseEntity.badRequest().body("セイを入力してください。");
        }
        if (tanpo.getMei()== null || tanpo.getMei().isEmpty()) {
            return ResponseEntity.badRequest().body("メイを入力してください。");
        }


        if (tanpo.getSex()== null || tanpo.getSex().isEmpty()) {
            return ResponseEntity.badRequest().body("性別を選んでください。");
        }

        if (tanpo.getMoshikomi()== null || tanpo.getMoshikomi().isEmpty()) {
            return ResponseEntity.badRequest().body("担保者となる理由を選んでください。");
        }

        if (tanpo.getTanpomono()== null || tanpo.getTanpomono().isEmpty()) {
            return ResponseEntity.badRequest().body("担保提供物を選んでください。");
        }

        if (tanpo.getRentai()== null || tanpo.getRentai().isEmpty()) {
            return ResponseEntity.badRequest().body("申請者と関係を選んでください。");
        }

        if (tanpo.getBirth() == null) {
           return ResponseEntity.badRequest().body("生年月日を選んでください。");
        }


//        if (tanpo.getPhone()== null || tanpo.getPhone().isEmpty()) {
//            return ResponseEntity.badRequest().body("電話番号を入力してください。");
//        }

        if (tanpo.getJob()== null || tanpo.getJob().isEmpty()) {
            return ResponseEntity.badRequest().body("職業を選んでください。");
        }
        if (tanpo.getAddress()== null || tanpo.getAddress().isEmpty()) {
            return ResponseEntity.badRequest().body("勤務先の名称を入力してください。");
        }
        userTanpoImpl.save(tanpo);
        return ResponseEntity.ok("保存成功");
    }}



