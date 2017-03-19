package com.zing.account.entity.valueObj;

import com.alibaba.fastjson.JSON;
import com.zing.account.entity.UserProfile;
import com.zing.account.entity.UserSecurity;

/**
 * Created by zing on 2017/3/19.
 */
public class UserInfo {
    private UserProfile profile;
    private UserSecurity security;

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public UserSecurity getSecurity() {
        return security;
    }

    public void setSecurity(UserSecurity security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
