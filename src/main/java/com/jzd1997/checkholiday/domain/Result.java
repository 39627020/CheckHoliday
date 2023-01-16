package com.jzd1997.checkholiday.domain;

import java.util.Map;

public class Result {
    private boolean isOk;
    private String msg;
    private Map data;

    public Result(){
        this.isOk = false;
        this.msg = null;
        this.data = null;
    }

    public Result(Boolean isOk,String msg,Map data){
        this.isOk = isOk;
        this.msg = msg;
        this.data = data;
    }

    public boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(boolean isOk) {
        this.isOk = isOk;
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
