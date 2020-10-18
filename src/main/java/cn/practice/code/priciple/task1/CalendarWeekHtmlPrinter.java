package cn.practice.code.priciple.task1;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/**
 * @author pi
 */
public class CalendarWeekHtmlPrinter extends CalendarWeekPrinter{


    private String returnHtmlFormatWeekNameString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<thread> \n <tr> \n");

        String[] weekName = returnWeekNameArray();
        List<String> weekNameList = Arrays.asList(weekName);
        weekNameList.forEach(week -> {
            stringBuffer.append("<td>");
            stringBuffer.append(week);
            stringBuffer.append("</td> \n");
        });

        stringBuffer.append("</tr> \n </thread> \n");

        return stringBuffer.toString();
    }

    private String returnHtmlFormatDateString(String inputDateStr) throws ParseException {
        StringBuffer stringBuffer = new StringBuffer();

        int[] weekCalendars = getWeekCalendars(inputDateStr);
        stringBuffer.append("<tbody> \n <tr> \n");

        for (int i = 0; i < weekCalendars.length; i++) {
            stringBuffer.append("<td>");
            stringBuffer.append(weekCalendars[i]);
            stringBuffer.append("</td> \n");
        }
        stringBuffer.append("</tr> \n </tbody> \n");

        return stringBuffer.toString();
    }

    @Override
    public void print(String inputDateString) throws ParseException {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("<table> \n");
        stringBuffer.append(returnHtmlFormatWeekNameString());
        stringBuffer.append(returnHtmlFormatDateString(inputDateString));
        stringBuffer.append("</table> \n");

        System.out.println(stringBuffer.toString());
    }
}