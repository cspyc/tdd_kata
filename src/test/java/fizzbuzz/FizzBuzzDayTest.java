package fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzDayTest {
    @Test
    public void speak_raw_number() {
        checkSpeakCode("1", 1);
    }

    @Test
    public void speak_fizz() {
        checkSpeakCode("Fizz", 3);
    }

    private void checkSpeakCode(String speakCode, int speakNumber) {
        FizzBuzzDay fizzBuzzDay = new FizzBuzzDay();
        assertThat(speakCode, Is.is(fizzBuzzDay.speakCode(speakNumber)));
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
    public void speak_fizz_or_buzz_when_contain_3_or_5() {
        checkSpeakCode("Fizz", 13);
        checkSpeakCode("Buzz",59);
    }
}
