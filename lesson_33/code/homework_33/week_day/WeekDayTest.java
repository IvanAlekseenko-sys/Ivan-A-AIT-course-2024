package homework_33.week_day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @Test
    void weekDayPlus() {
        WeekDay monday = WeekDay.MON;
        WeekDay wednesday = monday.weekDayPlus(2);
        assertEquals(WeekDay.WED, wednesday);
    }
}