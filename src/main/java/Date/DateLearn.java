package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateLearn {
    public String nowGelinweizhiTimeFormat() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,10,21,13,30,00);

        return sf.format(calendar.getTime());

    }
}
