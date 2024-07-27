package com.jzd1997.checkholiday.exception;

public enum CustomExceptionType {
    USER_INPUT_ERROR(400,"您输入的数据错误或您没有权限访问资源！"),
    SYSTEM_ERROR(500,"系统出现异常，请联系管理员！"),
    OTHER_ERROR(999,"系统未知异常，请联系管理员！");

    private String desc;
    private int code;
    CustomExceptionType(int code,String desc) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }
}
