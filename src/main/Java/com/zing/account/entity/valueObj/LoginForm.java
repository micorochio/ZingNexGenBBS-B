package com.zing.account.entity.valueObj;

import com.alibaba.fastjson.JSON;
import com.zing.security.captcha.controller.CaptchaController;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

/**
 * Created by zing on 2017/3/15.
 */
public class LoginForm {
    private String accountName;
    private String passcode;

    private String captcha;
    private String token;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String checkAllLoginData(HttpSession session) {
        String msg;
        msg = checkCaptcha(session);
        if (StringUtils.isEmpty(msg)) {
            msg = checkLoginNamePasscodeAndToken();
        }
        return msg;
    }

    private String checkLoginNamePasscodeAndToken() {
        if (!Pattern.matches("(W|N){6,}", accountName)) {
            return "用户不存在！";
        } else if (!(Pattern.matches("[0-9]+", passcode)
                && Pattern.matches("[a-z]+", passcode)
                && Pattern.matches("[A-Z]+", passcode)
        )) {
            return "密码不正确！";
        }else if(StringUtils.isEmpty(token)){
            return "页面已超时！";
        } else {
            return null;
        }
    }


    private String checkCaptcha(HttpSession session) {
        if(StringUtils.isEmpty(captcha)) return "验证码为空";
        long creatTime = (long) session.getAttribute(CaptchaController.CAPTCHA_TIME);
        if (System.currentTimeMillis() - creatTime > 120000l) {
            return "验证码超时失效";
        } else if (!captcha.equals(session.getAttribute(CaptchaController.CAPTCHA_KEY).toString().toUpperCase())) {
            return "验证码填写错误";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
