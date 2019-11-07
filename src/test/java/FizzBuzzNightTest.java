import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzNightTest {
    @Test
    public void speack_original_number() {
        checkNumber("1", 1);
        checkNumber("7", 7);
    }

    private void checkNumber(String speakCode, int rawNumber) {
        FizzBuzzNight fizzBuzzNight = new FizzBuzzNight();
        assertThat(speakCode, is(fizzBuzzNight.speakCode(rawNumber)));
    }

    @Test
    public void speak_fizz() {
        checkNumber("Fizz", 3);
    }

    @Test
    public void speak_buzz() {
        checkNumber("Buzz", 5);
    }

    @Test
    public void speak_fizz_buzz() {
        checkNumber("FizzBuzz", 15);
    }

    @Test
    public void speak_fizz_when_contains_3_or_buzz_when_contains_5() {
        checkNumber("Fizz",13);
        checkNumber("Buzz",52);
    }
}
