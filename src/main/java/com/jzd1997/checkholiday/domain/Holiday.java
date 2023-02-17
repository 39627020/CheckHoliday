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

    @Column(name = "fd_deleted")
    private int fd_deleted = 0;

    @Column(name = "fd_create_date")
    private Date fd_create_date;

    @Column(name = "fd_update_date")
    private Date fd_update_date;

    @Column(name = "fd_reserved1")
    private String fd_reserved1;

    @Column(name = "fd_reserved2")
    private String fd_reserved2;

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

    public int getFd_deleted() {
        return fd_deleted;
    }

    public void setFd_deleted(int fd_deleted) {
        this.fd_deleted = fd_deleted;
    }

    public Date getFd_create_date() {
        return fd_create_date;
    }

    public void setFd_create_date(Date fd_create_date) {
        this.fd_create_date = fd_create_date;
    }

    public Date getFd_update_date() {
        return fd_update_date;
    }

    public void setFd_update_date(Date fd_update_date) {
        this.fd_update_date = fd_update_date;
    }

    public String getFd_reserved1() {
        return fd_reserved1;
    }

    public void setFd_reserved1(String fd_reserved1) {
        this.fd_reserved1 = fd_reserved1;
    }

    public String getFd_reserved2() {
        return fd_reserved2;
    }

    public void setFd_reserved2(String fd_reserved2) {
        this.fd_reserved2 = fd_reserved2;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "fd_id=" + fd_id +
                ", fd_day='" + fd_day + '\'' +
                ", fd_name='" + fd_name + '\'' +
                ", fd_type=" + fd_type +
                ", fd_week=" + fd_week +
                ", fd_deleted=" + fd_deleted +
                ", fd_create_date=" + fd_create_date +
                ", fd_update_date=" + fd_update_date +
                ", fd_reserved1='" + fd_reserved1 + '\'' +
                ", fd_reserved2='" + fd_reserved2 + '\'' +
                '}';
    }
}
