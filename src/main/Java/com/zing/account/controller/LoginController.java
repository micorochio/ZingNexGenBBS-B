package com.zing.account.controller;

import com.zing.account.service.AccountService;
import com.zing.account.entity.valueObj.LoginForm;
import com.zing.account.entity.valueObj.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zing on 2017/3/15.
 */
@Controller()
@RequestMapping("/user")
public class LoginController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @PostMapping(value = "/login")
    public String login(LoginForm userInfo, HttpServletRequest request) {
//        request.getParameterMap().keySet().forEach(System.out::println);
//        System.out.println(msg);
        return "";
    }

    @RequestMapping("/goSignUp")
    public String goSignUp() {
        return "sign_up/signUp";
    }

    @PostMapping("/signUp")
    public ResultVo signUp(LoginForm userInfo, HttpSession session) {
        return accountService.singUp(userInfo,session);
    }
}
