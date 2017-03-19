<%--
  Created by IntelliJ IDEA.
  User: zing
  Date: 2017/3/17
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8; no-cache"/>

    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">

    <meta content="yes" name="apple-mobile-web-app-capable">

    <meta content="black" name="apple-mobile-web-app-status-bar-style">

    <meta content="telephone=no" name="format-detection">

    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>邀请注册</title>

    <link href="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="/rs/invite/css/invited.css" rel="stylesheet" type="text/css">

</head>
<body>
<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-4 form-box">
            <form action="/user/checkInvited" method="post">
                <input name="inviteCode" class="form-control text-input" type="text" placeholder="邀请码" method="post">

                <div class="chapter row justify-content-between">
                    <img class="col-4 chapter-img" src="/getCaptcha"/>
                    <input name="captcha" class="form-control text-input col-7  " type="text" placeholder="验证码">
                </div>

                <button type="submit" class="btn btn-primary col sign-btn">注&emsp;册</button>
            </form>
            <a class="go-login" href="/user/login">已有账号，去登陆</a>
        </div>
    </div>
</div>
<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>

</body>
</html>
