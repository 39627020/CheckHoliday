package com.jzd1997.checkholiday.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Holiday {

    public String getFd_day() {
        return fd_day;
    }

    public void setFd_day(String fd_day) {
        this.fd_day = fd_day;
    }

    public String getFd_name() {
        return fd_name;
    }

    public void setFd_name(String fd_name) {
        this.fd_name = fd_name;
    }

    public int getFd_type() {
        return fd_type;
    }

    public void setFd_type(int fd_type) {
        this.fd_type = fd_type;
    }

    public int getFd_week() {
        return fd_week;
    }

    public void setFd_week(int fd_week) {
        this.fd_week = fd_week;
    }

    private String fd_day = null;
    private String fd_name = null;
    private int fd_type = 0;
    private int fd_week = 0;

    public Holiday(){

    }

    public Holiday(String fd_day, String fd_name, int fd_type, int fd_week) {
        this.fd_day = fd_day;
        this.fd_name = fd_name;
        this.fd_type = fd_type;
        this.fd_week = fd_week;
    }
}
