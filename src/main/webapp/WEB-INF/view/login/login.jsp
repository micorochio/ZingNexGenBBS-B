<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zing
  Date: 2017/3/18
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8; no-cache"/>

    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">

    <meta content="yes" name="apple-mobile-web-app-capable">

    <meta content="black" name="apple-mobile-web-app-status-bar-style">

    <meta content="telephone=no" name="format-detection">

    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>登录</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="/rs/login/css/login.css" rel="stylesheet" type="text/css">

</head>
<body>
<div class="up-box">
    <div class="container">
        <div class="row justify-content-center">
            <form class="col-md-4 align-self-center input-former" action="/user/loginUp" method="post">
                <input class="form-control text-input" type="text" placeholder="手机号码" name="accountPhone">
                <input class="form-control text-input" type="text" placeholder="密码" name="passcode">
                <div class="chapter row justify-content-between">
                    <img class="col-4 chapter-img" src="/getCaptcha">
                    <input class="form-control text-input col-7  " type="text" placeholder="验证码" name="captcha">
                </div>
                <div class="change-to-login row justify-content-between">
                    <label class="chapter-change">点击图片更换验证码</label>
                    <a href="/user/login">没有账号，想获取邀请码</a>
                </div>
                <div class="remind-toast">
                    <p class="alert alert-danger alert-dismissible fade show" role="alert">
                        You should check in on some of those fields below.
                    </p>
                </div>
                <button type="submit" class="btn btn-primary col sign-up-btn">注&emsp;册</button>
            </form>
        </div>
    </div>
</div>
<div class="down-box">
    <p class="copyright">Copyright © 2017 Zing . All rights reserved</p>
</div>
<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.slim.min.js"
        integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
        crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
        integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>
<script src="/rs/sign_up/js/sign-up.js"></script>
</body>
</html>
