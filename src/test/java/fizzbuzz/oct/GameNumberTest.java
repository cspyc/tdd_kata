package fizzbuzz.oct;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/10/19 10:44 PM
 **/
public class GameNumberTest {

    @Test
    public void should_say_1_when_raw_number_is_1() throws Exception {
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString(), is("1"));
    }

    @Test
    public void should_say_fizz_when_raw_number_is_3() throws Exception {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString(), is("Fizz"));
    }

    @Test
    public void should_say_buzz_when_raw_nubmer_is_5() throws Exception {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString(), is("Buzz"));
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() throws Exception {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString(), is("FizzBuzz"));
    }
}
