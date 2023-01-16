package com.jzd1997.checkholiday.service;

import com.jzd1997.checkholiday.dao.IHolidayDao;
import com.jzd1997.checkholiday.domain.Holiday;
import com.jzd1997.checkholiday.domain.Weekday;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class HolidayServiceImpl implements IHolidayService{
    @Autowired
    private IHolidayDao dao;
    private List<Holiday> special;
    public HolidayServiceImpl(){
        special = new ArrayList<>();
        special.add(new Holiday("2023-01-01","元旦",2,6));
        special.add(new Holiday("2023-01-02","元旦调休",3,7));
        special.add(new Holiday("2023-01-21","春节",2,6));
        special.add(new Holiday("2023-01-22","春节",2,7));
        special.add(new Holiday("2023-01-23","春节",2,1));
        special.add(new Holiday("2023-01-24","春节",2,2));
        special.add(new Holiday("2023-01-25","春节",2,3));
        special.add(new Holiday("2023-01-26","春节调休",2,4));
        special.add(new Holiday("2023-01-27","春节调休",2,5));
        special.add(new Holiday("2023-01-28","周六",0,6));
        special.add(new Holiday("2023-01-29","周日",0,7));
        special.add(new Holiday("2023-04-05","清明",2,3));
        special.add(new Holiday("2023-04-29","周六",0,6));
        special.add(new Holiday("2023-04-30","周日",0,7));
        special.add(new Holiday("2023-05-01","劳动节",2,7));
        special.add(new Holiday("2023-05-02","劳动节换休",2,7));
        special.add(new Holiday("2023-05-03","劳动节换休",2,7));
        special.add(new Holiday("2023-05-04","劳动节换休",2,7));
        special.add(new Holiday("2023-05-05","劳动节换休",2,7));
        special.add(new Holiday("2023-06-22","端午",2,4));
        special.add(new Holiday("2023-06-23","端午换休",3,5));
        special.add(new Holiday("2023-09-29","中秋",0,5));
        special.add(new Holiday("2023-10-01","国庆",2,7));
        special.add(new Holiday("2023-10-02","国庆",2,1));
        special.add(new Holiday("2023-10-03","国庆",2,2));
        special.add(new Holiday("2023-10-04","国庆换休",3,7));
        special.add(new Holiday("2023-10-05","国庆换休",3,7));
        special.add(new Holiday("2023-10-06","国庆换休",3,7));
        special.add(new Holiday("2023-10-07","周六",0,6));
        special.add(new Holiday("2023-10-08","周日",0,7));
    }

    private void getSpecial(Holiday holiday){
        for(Holiday h:special){
            if(holiday.getFd_day().equals(h.getFd_day())){
                holiday.setFd_name(h.getFd_name());
                holiday.setFd_type(h.getFd_type());
                break;
            }
        }
    }

    @Override
    public long insertYear(String year){
        try{
            List<Holiday> days = new ArrayList<>();
            Date dt = DateUtils.parseDate("2023-01-01", "yyyy-MM-dd");

            Calendar ca;
            String date = "";
            String datestr = "";
            int type = 0;
            int weekday = 0;
            for(int i=0;i<365;i++){
                ca = DateUtils.toCalendar(dt);
                weekday = ca.get(Calendar.DAY_OF_WEEK) - 1;
                weekday = weekday==0?7:weekday;
                date = DateFormatUtils.format(dt,"yyyy-MM-dd");
                datestr = Weekday.getName(weekday);
                if(weekday>5){
                    type = 1;
                }else{
                    type = 0;
                }
                Holiday holiday = new Holiday(date,datestr,type,weekday);
                getSpecial(holiday);
                days.add(holiday);
                dt = DateUtils.addDays(dt,1);
            }
            return dao.insertYear(year,days);
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    public List<Holiday> query(String from, String to) {
        return dao.query(from,to);
    }
}
