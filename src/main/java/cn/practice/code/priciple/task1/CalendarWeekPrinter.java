package cn.practice.code.priciple.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author pi
 * @date 2020/04/15
 */
public class CalendarWeekPrinter {

    public String[] returnWeekNameArray() {
        String[] weekNames = {"日", "一", "二", "三", "四", "五", "六"};
        return weekNames;
    }

    public int[] getWeekCalendars(String inputDateStr) throws ParseException {
        Date fistDate = calculateFirstDayInTheWeekOfTheInputDate(inputDateStr);
        Calendar firstDateCalendar = Calendar.getInstance();
        firstDateCalendar.setTime(fistDate);

        int[] weekCalendars = new int[7];
        int weekDays = 7;
        for (int i = 0; i < weekDays; i++) {
            if (i == 0) {
                weekCalendars[i] = firstDateCalendar.get(Calendar.DAY_OF_MONTH);
            } else {
                firstDateCalendar.add(Calendar.DAY_OF_MONTH, 1);
                weekCalendars[i] = firstDateCalendar.get(Calendar.DAY_OF_MONTH);
            }
        }
        return weekCalendars;
    }

    private Date calculateFirstDayInTheWeekOfTheInputDate(String inputDateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = simpleDateFormat.parse(inputDateString);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        int inputDateWeekIndex = calendar.get(Calendar.DAY_OF_WEEK);

        calendar.add(Calendar.DAY_OF_MONTH, (-inputDateWeekIndex + 1));
        return calendar.getTime();
    }


    public void print(String inputDate) throws ParseException {

    }


    public static void main(String[] args) throws ParseException {

        System.out.println("请输入yyyy-MM-dd格式日期：");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        CalendarWeekPrinter calendarWeekPrinter = new CalendarWeekHtmlPrinter();
        calendarWeekPrinter.print(str);

        CalendarWeekPrinter calendarWeekPrinter1 = new CalendarWeekTextPrinter();
        calendarWeekPrinter1.print(str);

    }

}
