package com.jzd1997.checkholiday.repository;

import com.jzd1997.checkholiday.domain.Holiday;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HolidayRepository extends CrudRepository<Holiday,Long> {

    @Query("from Holiday where fd_day>=:from and fd_day<=:to")
    public List<Holiday> query(String from, String to);
}
