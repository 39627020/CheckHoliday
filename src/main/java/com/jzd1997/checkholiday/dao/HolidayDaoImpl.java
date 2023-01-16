
package com.jzd1997.checkholiday.dao;

import com.jzd1997.checkholiday.domain.Holiday;
import com.jzd1997.checkholiday.domain.Result;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HolidayDaoImpl implements IHolidayDao{
    public Connection conn = null;

    public HolidayDaoImpl(){
        try{
            String url = "jdbc:mysql://localhost:3306/point?useSSL=false&useUnicode=true&characterEncoding=utf8";
            //连接的数据库时使用的用户名
            String username = "root";
            //连接的数据库时使用的密码
            String password = "root123";
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取与数据库的链接
            conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public long insertYear(String year,List<Holiday> days) {
        long rows = 0;
        Statement st = null;
        try{
            conn.setAutoCommit(false);
            st = conn.createStatement();
            String sql = "delete from sys_holiday where DATE_FORMAT(fd_day,'%Y')='" + year + "'";
            st.execute(sql);
            for(Holiday day:days){
                sql = "insert into sys_holiday (fd_day,fd_name,fd_type,fd_week) values('" + day.getFd_day() + "',"
                        + "'" + day.getFd_name() + "'," + day.getFd_type() + "," + day.getFd_week() + ")";
                st.execute(sql);
                rows +=1;
            }
            conn.commit();
        }catch(Exception e){
            try{
                e.printStackTrace();
                conn.rollback();
            }catch (Exception ex){

            }
        }finally {
            try {
                st.close();
            }catch (Exception ex1){
                ex1.printStackTrace();
            }
        }
        return rows;
    }

    @Override
    public List<Holiday> query(String from, String to) {
        List<Holiday> list = new ArrayList<>();
        String sql = "select DATE_FORMAT(h.fd_day,'%Y%m%d') dt,h.fd_name,h.fd_type,h.fd_week\n" +
                "from sys_holiday h where DATE_FORMAT(h.fd_day,'%Y%m%d') BETWEEN '" + from + "' AND '"+ to + "'\n" +
                "order by dt ";
        Statement st = null;
        ResultSet rs = null;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Holiday holiday = new Holiday(rs.getString("dt"),rs.getString("fd_name"),
                        rs.getInt("fd_type"),rs.getInt("fd_week"));
                list.add(holiday);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                st.close();
            }catch (Exception e){

            }
        }
        return list;
    }
}
