package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/25 10:49 PM
 **/
public class GameNumber5Test {
    @Test
    public void should_speak_fizz_when_divided_by_3() throws Exception {
        GameNumber5 gameNumber5 = new GameNumber5(3);
        assertThat(gameNumber5.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_buzz_when_divided_by_5() throws Exception {
        GameNumber5 gameNumber5 = new GameNumber5(5);
        assertThat(gameNumber5.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_divided_by_3_and_5() throws Exception {
        GameNumber5 gameNumber5 = new GameNumber5(15);
        assertThat(gameNumber5.toString(), is("FizzBuzz"));

    }

    @Test
    public void should_speak_fizz_when_contains_3() throws Exception {
        GameNumber5 gameNumber5 = new GameNumber5(13);
        assertThat(gameNumber5.toString(), is("Fizz" +
                ""));
    }
}
