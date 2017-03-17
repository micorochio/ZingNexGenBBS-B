package com.zing.account.entity;

import java.util.Date;

/**
 * Created by zing on 2017/1/1.
 */
public class UserSecurity {
    private String usid;                        // '用户ID'
    private String loginEmail;                  // '用户邮箱'
    private String oauthFrom;                   // '授权来源'
    private String oauthId;                     // '授权号'
    private String oauthPassword;               // '授权秘钥'
    private String lastLoginIp;                 // '登录IP'
    private Date createDate;                    // '创建日期'
    private Date updateTime;                    // '更新时间'
    private String loginState;                  // '登录安全状态，正常，删除，异常...'
    private Date accountAbnormalStartTime;      // '账号异常起始时间    '
    private Date freezeEndTime;                 // '账号冻结结束时间    '
    private String salt;                        // '随机盐    '
//    private String reservedField2;            // '保留字段2'

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getOauthFrom() {
        return oauthFrom;
    }

    public void setOauthFrom(String oauthFrom) {
        this.oauthFrom = oauthFrom;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }

    public String getOauthPassword() {
        return oauthPassword;
    }

    public void setOauthPassword(String oauthPassword) {
        this.oauthPassword = oauthPassword;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginState() {
        return loginState;
    }

    public void setLoginState(String loginState) {
        this.loginState = loginState;
    }

    public Date getAccountAbnormalStartTime() {
        return accountAbnormalStartTime;
    }

    public void setAccountAbnormalStartTime(Date accountAbnormalStartTime) {
        this.accountAbnormalStartTime = accountAbnormalStartTime;
    }

    public Date getFreezeEndTime() {
        return freezeEndTime;
    }

    public void setFreezeEndTime(Date freezeEndTime) {
        this.freezeEndTime = freezeEndTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
