package fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz4Test {
    private FizzBuzz4 fb4;
    private String numberCode;
    private String speakCode;


    public FizzBuzz4Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initialObject() {
        fb4 = new FizzBuzz4();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzz4TestParameters() {
        return Arrays.asList(new String[][] {
            {"3","Fizz"},
            {"5","Buzz"},
                {"13","Fizz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"},
                {"52","Buzz"},
                {"1","1"}
        });
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb4.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb4.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb4.isDivided("12","3")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb4.isDivided("12","0");
    }

    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb4.isContained("11","1")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb4.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb4.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb4.startGame(numberCode)));
    }

    @Test
    public void isNotFizzOrBuzzTest() {
        assertThat(true,equalTo(fb4.isNotFizzOrBuzz("1")));
    }
}
