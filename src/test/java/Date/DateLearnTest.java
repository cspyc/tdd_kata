package Date;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateLearnTest {
    @Test
    public void return_geliweizhi_time_format() {
        DateLearn dateLearn = new DateLearn();
        assertEquals("2019-11-21T13:30:00+08:00",dateLearn.nowGelinweizhiTimeFormat());
    }
}
