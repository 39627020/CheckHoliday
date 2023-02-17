package com.jzd1997.checkholiday.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sys_holiday")
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fd_id")
    private Long fd_id; //客户的主键

    @Column(name = "fd_day")
    private String fd_day = null;
    @Column(name = "fd_name")
    private String fd_name = null;
    @Column(name = "fd_type")
    private int fd_type = 0;

    @Column(name = "fd_week")
    private int fd_week = 0;

    public Holiday(){

    }

    public Holiday(String day,String name,int type,int week){
        this.fd_day = day;
        this.fd_name = name;
        this.fd_type = type;
        this.fd_week = week;
    }
    public Long getFd_id() {
        return fd_id;
    }

    public void setFd_id(Long fd_id) {
        this.fd_id = fd_id;
    }

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

    @Override
    public String toString() {
        return "Holiday{" +
                "fd_id=" + fd_id +
                ", fd_day='" + fd_day + '\'' +
                ", fd_name='" + fd_name + '\'' +
                ", fd_type=" + fd_type +
                ", fd_week=" + fd_week +
                '}';
    }
}
