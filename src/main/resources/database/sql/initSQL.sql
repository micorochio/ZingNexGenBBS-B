CREATE DATABASE zs_cmc;

USE zs_cmc;
# 用户登录
CREATE TABLE `cmc_login_oauth` (
  `usid`                        BIGINT       NOT NULL
  COMMENT '用户ID',
  `login_email`                 VARCHAR(60)  NOT NULL
  COMMENT 'email登录',
  `oauth_from`                  VARCHAR(40)  DEFAULT NULL
  COMMENT '授权来源',
  `oauth_id`                    VARCHAR(256) DEFAULT NULL
  COMMENT '授权号',
  `oauth_password`              VARCHAR(128) NOT NULL
  COMMENT '授权秘钥',
  `last_login_ip`               VARCHAR(20)  NOT NULL
  COMMENT '上次登录IP',
  `create_date`                 DATETIME     NOT NULL
  COMMENT '创建日期',
  `update_time`                 DATETIME     NOT NULL
  COMMENT '更新时间',
  `login_state`                 VARCHAR(16)  DEFAULT '正常'
  COMMENT '账号安全状态，正常，删除，异常...',
  `account_abnormal_start_time` DATETIME     DEFAULT NULL
  COMMENT '账号异常起始时间',
  `freeze_end_time`             DATETIME     DEFAULT NULL
  COMMENT '账号冻结结束时间',
  `salt`                        VARCHAR(256) DEFAULT NULL
  COMMENT '随机盐',
  `reserved_field2`             VARCHAR(256) DEFAULT NULL
  COMMENT '保留字段2',
  PRIMARY KEY (`usid`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '用户登录';

# 用户信息
CREATE TABLE `cmc_user_profile` (
  `usid`              BIGINT      NOT NULL AUTO_INCREMENT
  COMMENT '用户编号',
  `nickname`          VARCHAR(40) NOT NULL
  COMMENT '用户昵称',
  `real_name`         VARCHAR(40) NOT NULL
  COMMENT '用户真实姓名',
  `birthday`          DATETIME             DEFAULT NULL
  COMMENT '生日',
  `user_introduction` VARCHAR(1200)        DEFAULT NULL
  COMMENT '用户介绍',
  `sex`               VARCHAR(10)          DEFAULT NULL
  COMMENT '性别',
  `phone_no`          VARCHAR(11)          DEFAULT NULL
  COMMENT '手机',
  `email`             VARCHAR(100)         DEFAULT NULL
  COMMENT '邮箱',
  `bound_email`       VARCHAR(100)         DEFAULT NULL
  COMMENT '绑定邮箱',
  `qq`                VARCHAR(100)         DEFAULT NULL
  COMMENT '企鹅号',
  `weibo`             VARCHAR(200)         DEFAULT NULL
  COMMENT '微博',
  `wechat`            VARCHAR(200)         DEFAULT NULL
  COMMENT '微信',
  `bound_phone`       VARCHAR(11)          DEFAULT NULL
  COMMENT '绑定手机',
  `bound_phone_time`  DATETIME             DEFAULT NULL
  COMMENT '绑定手机时间',
  `head_img`          VARCHAR(256)         DEFAULT NULL
  COMMENT '头像',
  `address`           VARCHAR(1200)        DEFAULT NULL
  COMMENT '住址',
  `point`             INT(11)     NOT NULL DEFAULT 0
  COMMENT '积分',
  `balance_point`     INT(11)     NOT NULL DEFAULT 0
  COMMENT '剩余积分',
  `person_home`       VARCHAR(100)         DEFAULT NULL
  COMMENT '个人主页地址',
  `create_date`       DATETIME    NOT NULL
  COMMENT '创建日期',
  `update_time`       DATETIME    NOT NULL
  COMMENT '更新时间',
  `account_state`     VARCHAR(16) NULL     DEFAULT '正常'
  COMMENT '账号状态，正常，删除，禁言...',
  PRIMARY KEY (`usid`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 10000
  DEFAULT CHARSET = utf8
  COMMENT '用户信息';


