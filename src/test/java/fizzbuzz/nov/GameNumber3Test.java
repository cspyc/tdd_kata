package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/03 8:54 PM
 **/
public class GameNumber3Test {
    @Test
    public void should_say_fizz_when_raw_number_is_divided_by_3() throws Exception {
        GameNumber3 gameNumber3 = new GameNumber3(3);
        assertThat(gameNumber3.toString(), is("Fizz"));
    }

    @Test
    public void should_say_buzz_when_raw_number_is_divided_by_5() throws Exception {
        GameNumber3 gameNumber3 = new GameNumber3(5);
        assertThat(gameNumber3.toString(), is("Buzz"));
    }

    @Test
    public void should_say_fizz_buzz_when_raw_number_is_divided_by_3_and_5() throws Exception {
        GameNumber3 gameNumber3 = new GameNumber3(15);
        assertThat(gameNumber3.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_say_fizz_when_raw_number_contain_3() throws Exception {
        GameNumber3 gameNumber3 = new GameNumber3(31);
        assertThat(gameNumber3.toString(), is("Fizz"));
    }
}
