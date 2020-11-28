package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/24 9:36 PM
 **/
public class GameNumber4Test {
    @Test
    public void should_speak_buzz_when_divided_by_5() throws Exception {
        GameNumber4 gameNumber4 = new GameNumber4(5);
        assertThat(gameNumber4.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_when_divided_by_3() throws Exception {
        GameNumber4 gameNumber4 = new GameNumber4(3);
        assertThat(gameNumber4.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_divided_by_3_and_5() throws Exception {
        GameNumber4 gameNumber4 = new GameNumber4(15);
        assertThat(gameNumber4.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_speak_fizz_when_contains_3() throws Exception {
        GameNumber4 gameNumber4 = new GameNumber4(13);
        assertThat(gameNumber4.toString(), is("Fizz"));
    }
}
