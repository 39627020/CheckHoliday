package com.jzd1997.checkholiday.service;

import java.util.List;

import com.jzd1997.checkholiday.domain.Holiday;

public interface IHolidayService {
    public long insertYear(String year);

    public List<Holiday> query(String from, String to);

    public Holiday findByFd_day(String day);
}
