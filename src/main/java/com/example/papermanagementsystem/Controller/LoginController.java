package com.example.papermanagementsystem.Controller;


import com.example.papermanagementsystem.Entity.StuInfo;
import com.example.papermanagementsystem.Entity.StuLogin;
import com.example.papermanagementsystem.Service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
//@RequestMapping("vote")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public int login(@RequestBody StuLogin loginInfo) {


        //用户不存在和账号密码错误
        //TODO cookie
        return loginService.login(loginInfo);

    }
}
