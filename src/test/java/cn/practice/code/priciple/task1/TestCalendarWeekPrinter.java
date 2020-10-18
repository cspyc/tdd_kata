package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestCalendarWeekPrinter {

    public static CalendarWeekPrinter calendarWeekPrinter;

    @BeforeClass
    public static void setUp() {
        calendarWeekPrinter = new CalendarWeekPrinter();
    }

    @Test
    public void should_return_a_array_contain_week_flag() {
        String[] weekNames = calendarWeekPrinter.returnWeekNameArray();

        Assert.assertEquals("日", weekNames[0]);
    }


}
