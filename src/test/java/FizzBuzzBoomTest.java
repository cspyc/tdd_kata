import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzBoomTest {
    @Test
    public void should_speak_1_when_number_is_1() {
        checkReturnSpeakCode("1", 1);
    }

    @Test
    public void should_speak_fizz_when_number_is_3() {
        checkReturnSpeakCode("Fizz", 3);
    }

    @Test
    public void should_speak_buzz_when_number_is_5() {
        checkReturnSpeakCode("Buzz", 5);
    }

    @Test
    public void should_speak_fizzbuzz_when_number_is_15() {
        checkReturnSpeakCode("FizzBuzz", 15);
    }

    @Test
    public void should_speak_fizz_or_buzz_when_number_contain_3_or_5() {
        checkReturnSpeakCode("Fizz",13);
        checkReturnSpeakCode("FizzBuzz",51);
    }

    private void checkReturnSpeakCode(String speakCode, int number) {
        FizzBuzzBoom fizzBuzzBoom = new FizzBuzzBoom();
        assertThat(speakCode, is(fizzBuzzBoom.speakCode(number)));
    }


}
