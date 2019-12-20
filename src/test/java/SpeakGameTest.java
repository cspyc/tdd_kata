import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SpeakGameTest {
    @Test
    public void speak_original_number() {
        checkSpeakCode("1", 1);
        checkSpeakCode("7", 7);
    }

    private void checkSpeakCode(String speakCode, int rawNumber) {
        SpeakGame speakGame = new SpeakGame();
        assertThat(speakCode, is(speakGame.speakCode(rawNumber)));
    }

    @Test
    public void speak_fizz_when_divided_by_3(){
        checkSpeakCode("Fizz",3);
        checkSpeakCode("Fizz",6);
    }

    @Test
    public void speak_buzz_when_divided_by_5(){
        checkSpeakCode("Buzz",5);
        checkSpeakCode("Buzz",50);
    }

    @Test
    public void speak_fizzbuzz_when_divided_by_3_and_5(){
        checkSpeakCode("FizzBuzz",15);
    }

    @Test
    public void speak_fizz_or_buzz_when_contains_3_or_5(){
        checkSpeakCode("Fizz",13);
        checkSpeakCode("Buzz",59);
        checkSpeakCode("FizzBuzz",51);
        checkSpeakCode("FizzBuzz",35);
    }
}
