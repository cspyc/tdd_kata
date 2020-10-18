package fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzz2020Test {

    private FizzBuzz2020 fizzBuzz2020;

    @Before
    public void setUp() {
        fizzBuzz2020 = new FizzBuzz2020();
    }

    @Test
    public void should_speak_fizz_buzz() throws Exception {
        Assert.assertEquals("FizzBuzz", fizzBuzz2020.speakFizzBuzzGame(15));
    }

    @Test
    public void should_speak_fizz_when_number_is_only_divided_by_3() throws Exception {
        Assert.assertEquals("Fizz", fizzBuzz2020.speakFizzBuzzGame(9));
    }

    @Test
    public void should_speak_buzz_when_number_is_only_divided_by_5() throws Exception {
        Assert.assertEquals("Buzz", fizzBuzz2020.speakFizzBuzzGame(25));
    }

    @Test
    public void should_speak_number_wehn_not_divided_by_3_or_5() throws Exception {
        Assert.assertEquals("8", fizzBuzz2020.speakFizzBuzzGame(8));
    }
}
