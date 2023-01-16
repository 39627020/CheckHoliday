package com.jzd1997.checkholiday.service;

import com.jzd1997.checkholiday.domain.Holiday;

import java.util.List;

public interface IHolidayService {
    public long insertYear(String year);

    public List<Holiday> query(String from, String to);
}
