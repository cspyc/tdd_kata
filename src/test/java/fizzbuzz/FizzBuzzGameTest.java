package fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {

    @Test
    public void speak_raw_number_when_number_cannot_fit_regular() {
        checkSpeakCode("1", 1);
        checkSpeakCode("2", 2);
    }

    @Test
    public void speak_fizz_when_number_is_3() {
        checkSpeakCode("Fizz", 3);
    }

    @Test
    public void speak_buzz_when_number_is_5() {
        checkSpeakCode("Buzz", 5);
    }

    @Test
    public void speak_fizzbuzz_when_number_is_15() {
        checkSpeakCode("FizzBuzz", 15);
        checkSpeakCode("FizzBuzz", 30);
    }

    @Test
    public void speak_fizz_or_buzz_when_number_contains_3_or_5() {
        checkSpeakCode("FizzBuzz",51);
        checkSpeakCode("Fizz",13);
        checkSpeakCode("FizzBuzz",35);
    }

    private void checkSpeakCode(String speakCode, int number) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(speakCode, Is.is(fizzBuzzGame.speakCode(number)));
    }

}
