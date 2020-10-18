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
public class FizzBuzz7Test {

    private FizzBuzz7 fb7;
    private String numberCode;
    private String speakCode;

    public FizzBuzz7Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initialObject() {
        fb7 = new FizzBuzz7();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameters() {
        return Arrays.asList(new String[][]{
                {"1", "1"},
                {"3", "Fizz"},
                {"13", "Fizz"},
                {"5", "Buzz"},
                {"35", "FizzBuzz"},
                {"51", "FizzBuzz"}
        });
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb7.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb7.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb7.isDivided("10","2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb7.isDivided("1","0");
    }


    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb7.isContained("10","0")));
    }


    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb7.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb7.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb7.startGame(numberCode)));
    }
}
