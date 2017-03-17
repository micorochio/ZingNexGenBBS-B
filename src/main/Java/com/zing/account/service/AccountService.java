package com.zing.account.service;

import com.zing.account.entity.valueObj.LoginForm;
import com.zing.account.entity.valueObj.ResultVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * Created by zing on 2017/3/16.
 */
@Service
public class AccountService  {
    public ResultVo invitedSingUp(LoginForm userInfo , HttpSession session){
        String msg = userInfo.checkAllLoginData(session);
        if(StringUtils.isEmpty(msg)){

        }
        return null;
    }
}
