package fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzSatTest {
    @Test
    public void speak_raw_number() {
        checkCode("1", 1);
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
    public void speak_fizz_when_contain_3_and_speak_buzz_when_contain_5() {
        checkCode("Fizz",13);
        checkCode("Buzz",58);
    }

    private void checkCode(String speakCode, int rawNumber) {
        FizzBuzzSat fizzBuzzSat = new FizzBuzzSat();
        assertThat(speakCode, Is.is(fizzBuzzSat.speak(rawNumber)));
    }
}
