package com.zing.account.controller;

import com.zing.account.entity.valueObj.InviteInfo;
import com.zing.account.entity.valueObj.LoginForm;
import com.zing.account.entity.valueObj.ResultVo;
import com.zing.account.entity.valueObj.UserInfo;
import com.zing.account.service.AccountService;
import com.zing.security.captcha.controller.CaptchaController;
import com.zing.security.token.TokenFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by zing on 2017/3/15.
 */
@Controller()
@RequestMapping("/user")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/login")
    public String login(HttpSession session) {
        if (session.getAttribute("userName") != null) {
            return "forward:/";
        } else {
            return "login/login";
        }
    }

    @PostMapping(value = "/loginUp")
    public String loginUp(LoginForm loginForm, HttpSession session) {
        if (checkCaptcha(loginForm.getCaptcha(), session)) {
            ResultVo resultVo = accountService.login(loginForm);
            if (resultVo.getCode() == 200) {
                UserInfo userInfo = (UserInfo) resultVo.getResult();
                session.setAttribute(TokenFactory.TAG, TokenFactory.getToken());
                session.setAttribute("userName", userInfo.getProfile().getNickname());
                // TODO 将User信息存储到Redis
                return "forward:/";
            } else {
                return "redirect:login";
            }
        } else {
            return "redirect:login";
        }

    }

    @RequestMapping(value = "/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @RequestMapping("/sign")
    public String goSignUp() {
        return "sign_up/signUp";
    }

    @PostMapping("/signUp")
    public ResultVo signUp(LoginForm userInfo, HttpSession session) {
        return accountService.invitedSingUp(userInfo, session);
    }

    @RequestMapping("/invite")
    public String invite() {
        return "invite/invited";
    }

    @PostMapping("/checkInvited")
    public String checkInvited(InviteInfo inviteInfo, HttpSession session) {
        if (checkCaptcha(inviteInfo.getCaptcha(), session)) {
            ResultVo vo = accountService.checkInvited(inviteInfo);
            if (200 == vo.getCode()) {
                session.setAttribute(TokenFactory.TAG, TokenFactory.getToken());
                session.setAttribute("inviteCode", inviteInfo.getInviteCode());
                return "redirect:sign";
            } else {
                return "redirect:invite";
            }
        } else {
            return "redirect:invite";
        }
    }

    private boolean checkCaptcha(String captcha, HttpSession session) {
        long creatTime = (long) session.getAttribute(CaptchaController.CAPTCHA_TIME);
        String userCap = (String) session.getAttribute(CaptchaController.CAPTCHA_KEY);
        if (System.currentTimeMillis() - creatTime > 120000l) {
            return false;
        } else if (userCap.toUpperCase().equals(captcha.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}
