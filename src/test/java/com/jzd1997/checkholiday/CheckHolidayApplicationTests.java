package com.jzd1997.checkholiday;

import com.jzd1997.checkholiday.domain.Weekday;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckHolidayApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void useWeekday(){
        System.out.println(Weekday.getName(1));
    }
}
