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
public class FizzBuzz11Test {

    private String numberCode;
    private String speakCode;
    private FizzBuzz11 fb11;

    public FizzBuzz11Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initialObject() {
        fb11 = new FizzBuzz11();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameter() {
        return Arrays.asList(new String[][]{
                {"2", "2"},
                {"3", "Fizz"},
                {"5","Buzz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    @Test
    public void createNumberTest() {
        assertThat(100,equalTo(fb11.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumberExceptionTest() {
        fb11.createNumbers(-1);
    }


    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb11.isDivided("10","5")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb11.isDivided("10","0");
    }

    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb11.isContained("10","0")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb11.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb11.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb11.startGame(numberCode)));
    }
}
