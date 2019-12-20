import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzDayDayTest {
    @Test
    public void speak_raw_number() {
        checkSpeakCode(1, "1");
        checkSpeakCode(7,"7");
    }

    @Test
    public void speak_fizz() {

        checkSpeakCode(3, "Fizz");
    }

    @Test
    public void speak_buzz(){
        checkSpeakCode(5,"Buzz");
    }

    @Test
    public void speak_fizz_buzz(){
        checkSpeakCode(15,"FizzBuzz");
    }

    @Test
    public void speak_fizz_when_contains_3_and_speak_buzz_when_contains_5(){
        checkSpeakCode(13,"Fizz");
        checkSpeakCode(58,"Buzz");
        checkSpeakCode(51,"FizzBuzz");
        checkSpeakCode(35,"FizzBuzz");
    }

    private void checkSpeakCode(int rawNumber, String fizz) {
        FizzBuzzDayDay fizzBuzzDayDay = new FizzBuzzDayDay();
        assertThat(fizz, is(fizzBuzzDayDay.speak(rawNumber)));
    }
}
