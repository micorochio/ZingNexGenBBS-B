package com.zing.account.entity;

import java.util.Date;

/**
 * Created by zing on 2017/3/17.
 */
public class InviteTable {
    public String inviteId;
    public String inviteHost;
    public  String inviteGest;
    public String inviteCode;
    public String inviteResult;
    public Date startTime;
    public Date updateTime;

    public String getInviteId() {
        return inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    public String getInviteHost() {
        return inviteHost;
    }

    public void setInviteHost(String inviteHost) {
        this.inviteHost = inviteHost;
    }

    public String getInviteGest() {
        return inviteGest;
    }

    public void setInviteGest(String inviteGest) {
        this.inviteGest = inviteGest;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getInviteResult() {
        return inviteResult;
    }

    public void setInviteResult(String inviteResult) {
        this.inviteResult = inviteResult;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "InviteTable{" +
                "inviteId='" + inviteId + '\'' +
                ", inviteHost='" + inviteHost + '\'' +
                ", inviteGest='" + inviteGest + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", inviteResult='" + inviteResult + '\'' +
                ", startTime=" + startTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
