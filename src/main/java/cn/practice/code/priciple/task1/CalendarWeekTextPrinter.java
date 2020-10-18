package cn.practice.code.priciple.task1;

import java.text.ParseException;

/**
 * @author pi
 */
public class CalendarWeekTextPrinter extends CalendarWeekPrinter {

    private void printTextFormatWeekday() {

        String[] weekdays = returnWeekNameArray();
        for (int i = 0; i < weekdays.length; i++) {
            System.out.printf("%s \t", weekdays[i]);
        }
        System.out.println("\n");
    }

    private void printTextFormatCalendarDate(String inputDateStr) throws ParseException {
        int[] calendarDate = getWeekCalendars(inputDateStr);
        for (int i = 0; i < calendarDate.length; i++) {
            System.out.printf("%d \t", calendarDate[i]);
        }
        System.out.println("\n");
    }

    @Override
    public void print(String inputDateStr) throws ParseException {
        printTextFormatWeekday();
        printTextFormatCalendarDate(inputDateStr);
    }
}