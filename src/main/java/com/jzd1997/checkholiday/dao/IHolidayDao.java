package com.jzd1997.checkholiday.dao;

import com.jzd1997.checkholiday.domain.Holiday;

import java.util.List;

public interface IHolidayDao {
    public long insertYear(String name,List<Holiday> days);
    public List<Holiday> query(String from,String to);
}
