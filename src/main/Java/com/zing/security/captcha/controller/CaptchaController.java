package com.zing.security.captcha.controller;

import com.zing.security.captcha.CaptchaImageProducer;
import com.zing.security.random_string.RandomUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by zing on 2017/3/15.
 */
@Controller
public class CaptchaController {


    public static final String CAPTCHA_KEY = "login&signInCAPTCHA";
    public static final String CAPTCHA_TIME = "CAPTCHACreateTime";

    @RequestMapping("/getCaptcha")
    public  void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageIO.setUseCache(false);

        HttpSession session = request.getSession();
        response.setHeader("Cache-Control", "n0-store,no-catch");
        response.setContentType("image/jpeg");

        //创建随机验证码
        String capStr = RandomUtil.getRandomStringFrom(4, RandomUtil.LOWER_CASE, RandomUtil.UPPER_CASE, RandomUtil.NUMBERS);
        //创建验证码图片
        BufferedImage bufferedImage = CaptchaImageProducer.getInstance().createCAPTCHAImage(capStr);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(bufferedImage, "jpg", outputStream);

        session.setAttribute(CAPTCHA_KEY, capStr.toUpperCase());
        session.setAttribute(CAPTCHA_TIME, System.currentTimeMillis());//CTT是上海时间
    }
}
