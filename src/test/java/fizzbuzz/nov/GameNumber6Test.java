package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/28 11:55 AM
 **/
public class GameNumber6Test {
    @Test
    public void should_speak_fizz_when_divided_by_3() throws Exception {
        GameNumber6 gameNumber6 = new GameNumber6(3);
        assertThat(gameNumber6.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_buzz_when_divided_by_5() throws Exception {
        GameNumber6 gameNumber6 = new GameNumber6(5);
        assertThat(gameNumber6.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_divided_by_3_and_5() throws Exception {
        GameNumber6 gameNumber6 = new GameNumber6(15);
        assertThat(gameNumber6.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_speak_fizz_when_contain_3() throws Exception {
        GameNumber6 gameNumber6 = new GameNumber6(13);
        assertThat(gameNumber6.toString(), is("Fizz"));
    }
}
