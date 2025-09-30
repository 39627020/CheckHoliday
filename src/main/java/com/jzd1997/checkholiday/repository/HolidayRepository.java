package com.jzd1997.checkholiday.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jzd1997.checkholiday.domain.Holiday;

public interface HolidayRepository extends CrudRepository<Holiday,Long> {

    @Query("from Holiday where fd_day>=:from and fd_day<=:to")
    public List<Holiday> query(String from, String to);

    @Query("from Holiday where fd_day=:day")
    public Holiday findByFd_day(String day);

    @Modifying
    @Query("delete from Holiday where fd_day >= concat(:year, '-01-01') and fd_day <= concat(:year, '-12-31')")
    int deleteByYear(@Param("year") String year);
}
