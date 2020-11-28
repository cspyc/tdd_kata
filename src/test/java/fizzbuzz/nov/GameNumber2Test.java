package fizzbuzz.nov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/02 11:43 PM
 **/
public class GameNumber2Test {
    @Test
    public void should_create_game_number_object() throws Exception {
    }

    @Test
    public void should_speak_fizz_when_raw_number_is_divided_by_3() throws Exception {
        GameNumber2 gameNumber2 = new GameNumber2(3);
        assertThat(gameNumber2.toString(), is("Fizz"));
    }

    @Test
    public void should_speak_buzz_when_raw_number_is_divide_by_5() throws Exception {
        GameNumber2 gameNumber2 = new GameNumber2(5);
        assertThat(gameNumber2.toString(), is("Buzz"));
    }

    @Test
    public void should_speak_fizz_buzz_when_raw_number_is_divide_by_3_and_5() throws Exception {
        GameNumber2 gameNumber2 = new GameNumber2(15);
        assertThat(gameNumber2.toString(), is("FizzBuzz"));
    }

    @Test
    public void should_should_speak_fizz_when_raw_number_is_contain_3() throws Exception {
        GameNumber2 gameNumber2 = new GameNumber2(13);
        assertThat(gameNumber2.toString(), is("Fizz"));
    }
}
