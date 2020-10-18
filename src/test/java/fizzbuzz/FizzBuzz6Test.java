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
public class FizzBuzz6Test {

    public FizzBuzz6 fb6;
    public String numberCode;
    public String speakCode;

    public FizzBuzz6Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initialObject() {
        fb6 = new FizzBuzz6();
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
        assertThat(100,equalTo(fb6.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb6.createNumbers(-1);
    }


    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb6.isDivided("12","3")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb6.isDivided("11","0");
    }

    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb6.isContained("14","4")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb6.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb6.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb6.startGame(numberCode)));
    }

}
