package com.zing.account.entity.valueObj;

import com.alibaba.fastjson.JSON;

/**
 * Created by zing on 2017/3/16.
 */
public class ResultVo {
    private Object result;
    private Integer code;
    private String DESC;

    public Object getResult() {
        return result;
    }


    public Integer getCode() {
        return code;
    }


    public String getDESC() {
        return DESC;
    }


    public ResultVo Result(Object obj) {
        this.result = obj;
        return this;
    }

    public ResultVo Desc(String desc) {
        this.DESC = desc;
        return this;
    }

    public ResultVo Code(int code) {
        this.code= code;
        return this;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
