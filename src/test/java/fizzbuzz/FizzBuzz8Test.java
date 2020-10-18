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
public class FizzBuzz8Test {
    private FizzBuzz8 fb8;
    private String numberCode;
    private String speakCode;

    @Before
    public void initialObject() {
        fb8 = new FizzBuzz8();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzParameters() {
        return Arrays.asList(new String[][]{
                {"2","2"},
                {"3","Fizz"},
                {"5","Buzz"},
                {"13","Fizz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    public FizzBuzz8Test(String numberCode,String speakCode) {
        this.speakCode = speakCode;
        this.numberCode = numberCode;
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb8.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersException() {
        fb8.createNumbers(-1);
    }


    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb8.isDivided("6","3")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb8.isDivided("5","0");
    }

    @Test

    public void isContainedTest() {
        assertThat(true,equalTo(fb8.isContained("15","5")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb8.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb8.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb8.startGame(numberCode)));
    }
}
