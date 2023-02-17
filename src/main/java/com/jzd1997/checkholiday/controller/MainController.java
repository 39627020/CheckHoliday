package com.jzd1997.checkholiday.controller;

import com.jzd1997.checkholiday.domain.Holiday;
import com.jzd1997.checkholiday.domain.Result;
import com.jzd1997.checkholiday.service.IHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {
    @Autowired
    IHolidayService holidayService;

    @GetMapping("/create")
    public Result create(String year) {
        Result res = new Result();
        Map data = new HashMap();
        try{
            long rows = holidayService.insertYear(year);
            res.setMsg(String.format("插入%d条日历数据",rows));
            data.put("Count",rows);
            res.setData(data);
        }catch (Exception e){
            res.setCode(1);
            res.setMsg("异常错误，请联系管理员");
        }
        return res;
    }

    @GetMapping("/query")
    public Result query(String from,String to) {
        Result res = new Result();
        Map data = new HashMap();
        try{
            List<Holiday> list = holidayService.query(from,to);
            res.setMsg(String.format("查询到%d条日历数据",list==null?0:list.size()));
            data.put("list",list);
            res.setData(data);
        }catch (Exception e){
            e.printStackTrace();
            res.setCode(1);
            res.setMsg("异常错误，请联系管理员");
        }
        return res;
    }

}
