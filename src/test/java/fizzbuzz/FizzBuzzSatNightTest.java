package fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzSatNightTest {
    @Test
    public void speak_raw_number() {
        checkSpeakCode("1", 1);
    }

    @Test
    public void speak_fizz() {
        checkSpeakCode("Fizz", 3);
    }

    @Test
    public void speak_buzz() {
        checkSpeakCode("Buzz", 5);
    }

    @Test
    public void speak_fizz_buzz() {
        checkSpeakCode("FizzBuzz", 15);
    }

    @Test
    public void speak_fizz_when_contain_3() {
        checkSpeakCode("Fizz", 13);
    }

    @Test
    public void speak_buzz_when_contain_5() {
        checkSpeakCode("Buzz", 58);
    }

    private void checkSpeakCode(String fizz, int i) {
        FizzBuzzSatNight fizzBuzzSatNight = new FizzBuzzSatNight();
        assertThat(fizz, Is.is(fizzBuzzSatNight.speakCode(i)));
    }
}
