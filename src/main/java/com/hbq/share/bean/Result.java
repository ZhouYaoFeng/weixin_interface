package com.hbq.share.bean;

import java.util.Map;

/**
 * Created by zyf10 on 2017/6/24.
 */
public class Result {
    String msg = "";
    Integer status = 0;
    Object result =null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "msg='" + msg + '\'' +
                ", status=" + status +
                ", result=" + result +
                '}';
    }

    public Result() {
    }
}
