package com.jzd1997.checkholiday.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jzd1997.checkholiday.domain.Holiday;

public interface HolidayRepository extends CrudRepository<Holiday,Long> {

    @Query("from Holiday where fd_day>=:from and fd_day<=:to")
    public List<Holiday> query(String from, String to);

    @Query("from Holiday where fd_day=:day")
    public Holiday findByFd_day(String day);
}
