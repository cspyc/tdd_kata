package fizzbuzz.oct;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author pi
 * @date 2020/10/18 9:35 PM
 **/
public class FizzBuzzGameTest {
    @Test
    public void should_say_Fizz_when_divided_by_3() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String sayFizz = fizzBuzzGame.say(3);
        assertThat(sayFizz, is("Fizz"));
    }

    @Test
    public void should_say_Buzz_when_divide_by_5() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String sayBuzz = fizzBuzzGame.say(5);
        assertThat(sayBuzz, is("Buzz"));
    }

    @Test
    public void should_say_FizzBuzz_when_divided_by_3_and_5() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String sayFizzBuzz = fizzBuzzGame.say(15);
        assertThat(sayFizzBuzz, is("FizzBuzz"));
    }

    @Test
    public void should_say_origin_number() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String sayOriginNumber = fizzBuzzGame.say(1);
        assertThat(sayOriginNumber, is("1"));
    }
}
