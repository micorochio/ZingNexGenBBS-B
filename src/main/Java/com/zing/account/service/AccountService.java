package com.zing.account.service;

import com.zing.account.dao.SignAndLoginDao;
import com.zing.account.entity.InviteTable;
import com.zing.account.entity.valueObj.InviteInfo;
import com.zing.account.entity.valueObj.LoginForm;
import com.zing.account.entity.valueObj.ResultVo;
import com.zing.account.entity.valueObj.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by zing on 2017/3/16.
 */

@Service
public class AccountService {

    @Autowired
    SignAndLoginDao signAndLoginDao;

    public ResultVo invitedSingUp(LoginForm userInfo, HttpSession session) {
//        String msg = userInfo.checkAllLoginData(session);
//        if (StringUtils.isEmpty(msg)) {
//        }
        return null;
    }

    public void selectDemo() {
        System.out.println(signAndLoginDao);
        System.out.println(signAndLoginDao.getInviteInfoByInviteCode("uhqwebfuqehbueUVBEU891732"));
    }

    public ResultVo checkInvited(InviteInfo inviteInfo) {
        InviteTable invite = signAndLoginDao.getInviteInfoByInviteCode(inviteInfo.getInviteCode());
        if(null!=invite){
            return new ResultVo().Code(200).Desc("邀请成功，可注册").Result(invite);
        }else {
            return new ResultVo().Code(300).Desc("邀请失败，重新输入邀请码").Result(invite);
        }
    }

    public ResultVo login(LoginForm loginForm) {
        UserInfo user = signAndLoginDao.findUserByNameAndPasscode(loginForm);
       if(user!=null){
           return new ResultVo().Code(200).Desc("查询成功，请验证用户权限").Result(user);
       }else {
           return new ResultVo().Code(300).Desc("查询失败");
       }
    }
}
