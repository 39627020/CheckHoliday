package com.jzd1997.checkholiday.domain;

import java.util.Map;

public class Result {
    private int code;
    private String msg;
    private Map data;

    public Result(){
        this.code = 0;
        this.msg = null;
        this.data = null;
    }

    public Result(int code,String msg,Map data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
