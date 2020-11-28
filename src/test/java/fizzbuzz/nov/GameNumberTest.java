package fizzbuzz.nov;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/01 11:45 PM
 **/
public class GameNumberTest {
    @Test
    public void should_speak_fizz_when_raw_number_is_divided_by_3() throws Exception {
        GameNumber1 gameNumber1 = new GameNumber1(3);
        assertThat(gameNumber1.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_fuzz_when_raw_number_is_divided_by_5() throws Exception {
        GameNumber1 gameNumber1 = new GameNumber1(5);
        assertThat(gameNumber1.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_raw_number_is_divide_by_3__and_5() throws Exception {
        GameNumber1 gameNumber1 = new GameNumber1(15);
        assertThat(gameNumber1.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_speak_fizz_when_raw_number_is_contain_3() throws Exception {
        GameNumber1 gameNumber1 = new GameNumber1(13);
        assertThat(gameNumber1.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_fizzbuzz_when_raw_number_is_contain_5_and_divided_by_3() throws Exception {
        GameNumber1 gameNumber1 = new GameNumber1(15);
        assertThat(gameNumber1.toString(), is("FizzBuzz"));
    }
}
