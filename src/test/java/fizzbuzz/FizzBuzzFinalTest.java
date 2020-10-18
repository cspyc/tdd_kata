package fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzFinalTest {
    @Test
    public void speak_raw_number() {
        checkSpeakCode("1", 1);
    }

    @Test
    public void speak_fizz_when_divided_by_3() {
        checkSpeakCode("Fizz", 3);
    }

    @Test
    public void speak_buzz_when_divided_by_5() {
        checkSpeakCode("Buzz", 5);
    }

    @Test
    public void speak_fizz_buzz_when_divided_by_3_and_5() {
        checkSpeakCode("FizzBuzz",15);
    }

    @Test
    public void speak_fizz_when_contains_3(){
        checkSpeakCode("Fizz",13);
    }

    @Test
    public void speak_buzz_when_contains_5(){
        checkSpeakCode("Buzz",58);
    }

    private void checkSpeakCode(String speakCode, int rawNumber) {
        FizzBuzzFinal fizzBuzzFinal = new FizzBuzzFinal();
        assertThat(speakCode, Is.is(fizzBuzzFinal.speakCode(rawNumber)));
    }
}
