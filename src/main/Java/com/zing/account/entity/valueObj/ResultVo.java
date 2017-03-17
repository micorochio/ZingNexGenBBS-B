package com.zing.account.entity.valueObj;

import com.alibaba.fastjson.JSON;

/**
 * Created by zing on 2017/3/16.
 */
public class ResultVo {
    Object result;
    Integer code;
    String DESC;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
