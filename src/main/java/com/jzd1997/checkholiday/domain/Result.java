package com.jzd1997.checkholiday.domain;

import com.jzd1997.checkholiday.exception.CustomException;

public class Result {
    private int code;
    private String msg;
    private Object data;


    private Result(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(){
        return new Result(200,"调用成功",null);
    }

    public static Result success(String msg){
        return new Result(200,msg,null);
    }

    public static Result success(String msg,Object data){
        return new Result(200,msg,data);
    }

    public static Result error(CustomException e){
        return new Result(e.getCode(),e.getMessage(),null);
    }
    public static Result error(CustomException e,String msg){
        return new Result(e.getCode(),msg,null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
