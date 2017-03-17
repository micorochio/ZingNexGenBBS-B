package com.zing.account.entity;

import com.sun.istack.internal.NotNull;

/**
 * Created by zing on 2017/1/1.
 * @see
 */

public class UserProfile {
    private String usid;    //'用户编号',
    private String nickname;    //'用户昵称',
    private String realName;    //'用户真实姓名',
    private String birthday;    //'生日',
    private String userIntroduction;    //'用户介绍',
    private String sex;    //'性别',
    private String phoneNo;    //'手机',
    private String email;    //'邮箱',
    private String qq;    //'企鹅号',
    private String weibo;    //'微博',
    private String wechat;    //'微信',
    private String boundPhone;    //'绑定手机',
    private String boundPhoneTime;    //'绑定手机时间',
    private String headImg;    //'头像',
    private String address;    //'住址',
    private String point;    //'积分',
    private String balancePoint;    //'剩余积分',
    private String personHome;    //'个人主页地址',
    private String createDate;    //'创建日期',
    private String updateTime;    //'更新时间',
    @NotNull
    private String accountState;    //'账号状态，正常，删除，禁言...',


    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getBoundPhone() {
        return boundPhone;
    }

    public void setBoundPhone(String boundPhone) {
        this.boundPhone = boundPhone;
    }

    public String getBoundPhoneTime() {
        return boundPhoneTime;
    }

    public void setBoundPhoneTime(String boundPhoneTime) {
        this.boundPhoneTime = boundPhoneTime;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getBalancePoint() {
        return balancePoint;
    }

    public void setBalancePoint(String balancePoint) {
        this.balancePoint = balancePoint;
    }

    public String getPersonHome() {
        return personHome;
    }

    public void setPersonHome(String personHome) {
        this.personHome = personHome;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
    }


}
