package com.zing.account.dao;

import com.zing.account.entity.InviteTable;
import com.zing.account.entity.valueObj.LoginForm;
import com.zing.account.entity.valueObj.UserInfo;

/**
 * Created by zing on 2017/3/17.
 */
public interface SignAndLoginDao {

    InviteTable getInviteInfoByInviteCode(String inviteCode);

    UserInfo findUserByNameAndPasscode(LoginForm login);
}
