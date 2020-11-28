package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/04 11:56 PM
 **/
public class GameNumber0Test {
    @Test
    public void should_create_say_1_when_raw_number_is_1() throws Exception {
        GameNumber0 gameNumber0 = new GameNumber0(1);
        assertThat(gameNumber0.toString(), is("1"));
    }

    @Test
    public void should_say_fizz_when_raw_number_is_divided_by_3() throws Exception {
        GameNumber0 gameNumber0 = new GameNumber0(3);
        assertThat(gameNumber0.toString(), is("Fizz"));
    }

    @Test
    public void should_say_buzz_when_raw_number_is_divided_by_5() throws Exception {
        GameNumber0 gameNumber0 = new GameNumber0(5);
        assertThat(gameNumber0.toString(), is("Buzz"));
    }

    @Test
    public void should_say_fizz_buzz_when_raw_number_is_divided_by_3_and_5() throws Exception {
        GameNumber0 gameNumber0 = new GameNumber0(15);
        assertThat(gameNumber0.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_say_fizz_when_raw_number_contains_3() throws Exception {
        GameNumber0 gameNumber0 = new GameNumber0(31);
        assertThat(gameNumber0.toString(), is("Fizz"));
    }
}
