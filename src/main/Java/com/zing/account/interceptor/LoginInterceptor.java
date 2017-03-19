package com.zing.account.interceptor;

import com.zing.security.token.TokenFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zing on 2017/3/18.
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();
        String token = (String) session.getAttribute(TokenFactory.TAG);
        String user = (String) session.getAttribute("userName");
        if (StringUtils.isEmpty(token)) {
            System.out.println(request.getRequestURL().append(":被拦截"));
            return false;
        }else {
            request.getRequestDispatcher(request.getRequestURL().toString()).forward(request, response);
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
