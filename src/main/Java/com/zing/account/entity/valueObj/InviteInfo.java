package com.zing.account.entity.valueObj;

/**
 * Created by zing on 2017/3/17.
 */
public class InviteInfo {
    private String inviteCode;
    private String captcha;

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
