package com.jzd1997.checkholiday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jzd1997.checkholiday.domain.Holiday;
import com.jzd1997.checkholiday.domain.Result;
import com.jzd1997.checkholiday.service.IHolidayService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/holidays")
public class HolidayController {
    @Autowired
    IHolidayService holidayService;

    @GetMapping("/create/{year}")
    public Result create(@ApiParam(value = "创建年份，如2024", required = true)@PathVariable String year) {
        long rows = holidayService.insertYear(year);
        String msg = String.format("插入%d条日历数据",rows);
        Result res = Result.success(msg);

        return res;
    }

    @GetMapping("/interval")
    public Result getByInterval(@ApiParam(value = "开始日期，如2024-01-01", required = true)@RequestParam("from") String from, 
                                @ApiParam(value = "结束日期，如2024-01-05", required = true)@RequestParam("to") String to) {
        List<Holiday> list = holidayService.query(from,to);
        String msg = String.format("查询到%d条日历数据",list==null?0:list.size());
        Result res =  Result.success(msg,list);
        return res;
    }

    @GetMapping("{day}")
    public Result getByFd_day(@ApiParam(value = "日期，如2024-01-01", required = true)@PathVariable("day") String day) {
        Holiday holiday = holidayService.findByFd_day(day);
        Result res = Result.success("调用成功", holiday);
        return res;
    }
    
}
