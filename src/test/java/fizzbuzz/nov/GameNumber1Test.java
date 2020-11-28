package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/23 11:57 PM
 **/
public class GameNumber1Test {

    @Test
    public void should_speak_fizz_when_raw_number_divided_by_3() throws Exception {
        GameNumber10 gameNumber10 = new GameNumber10(3);
        assertThat(gameNumber10.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_buzz_when_raw_number_divided_by_5() throws Exception {
        GameNumber10 gameNumber10 = new GameNumber10(5);
        assertThat(gameNumber10.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_raw_number_divided_by_3_and_5() throws Exception {
        GameNumber10 gameNumber10 = new GameNumber10(15);
        assertThat(gameNumber10.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_speak_fizz_when_raw_number_contain_3() throws Exception {
        GameNumber10 gameNumber10 = new GameNumber10(13);
        assertThat(gameNumber10.toString(), is("Fizz"));
    }
}
