import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz10Test {

    private FizzBuzz10 fb10;
    private String numberCode;
    private String speakCode;


    @Before
    public void initialObject() {
        fb10 = new FizzBuzz10();
    }

    public FizzBuzz10Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }



    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameters() {
        return Arrays.asList(new String[][]{
                {"2","2"},
                {"3","Fizz"},
                {"5","Buzz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb10.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionsTest() {
        fb10.createNumbers(-10);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb10.isDivided("10","5")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedTestException() {
        fb10.isDivided("10","0");
    }


    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb10.isContained("10","0")));
    }


    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb10.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb10.isBuzz("5")));
    }


    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb10.startGame(numberCode)));
    }
}
