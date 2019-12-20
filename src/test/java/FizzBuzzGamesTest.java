import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzGamesTest {
    @Test
    public void speak_raw_number() {
        checkCode("1", 1);
    }

    private void checkCode(String s, int i) {
        FizzBuzzGames fizzBuzzGames = new FizzBuzzGames();
        assertThat(s, is(fizzBuzzGames.speakCode(i)));
    }

    @Test
    public void speak_fizz() {
        checkCode("Fizz", 3);
    }

    @Test
    public void speak_buzz() {
        checkCode("Buzz", 5);
    }

    @Test
    public void speak_fizz_buzz() {
        checkCode("FizzBuzz", 15);
    }

    @Test
    public void speak_fizz_or_buzz_when_contain_3_or_5() {
        checkCode("Fizz",13);
        checkCode("Buzz",59);
        checkCode("FizzBuzz",51);
        checkCode("FizzBuzz",35);
    }


}
