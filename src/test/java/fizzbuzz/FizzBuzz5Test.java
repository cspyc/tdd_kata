package fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz5Test {

    private String numberCode;
    private String speakCode;

    private FizzBuzz5 fb5;

    @Before
    public void initialObject() {
        fb5 = new FizzBuzz5();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzz5Parameters() {
        return Arrays.asList(new String[][]{
                {"1","1"},
                {"3","Fizz"},
                {"5","Buzz"},
                {"23","Fizz"},
                {"25","Buzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    public FizzBuzz5Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Test
    public void createNumberTest() {
        assertThat(100,equalTo(fb5.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb5.createNumbers(-1);
    }

//    @Test
//    public void isDividedTest() {
//        assertThat(true,equalTo(fb5.isDivided("12","3")));
//    }
//
    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb5.isDivided("10","0");
    }
//
//    @Test
//    public void isContaindedTest() {
//        assertThat(true,equalTo(fb5.isContained("13","3")));
//    }
//
//    @Test
//    public void isFizzTest() {
//        assertThat(true,equalTo(fb5.isFizz("3")));
//    }
//
//    @Test
//    public void isBuzzTest() {
//        assertThat(true,equalTo(fb5.isBuzz("5")));
//    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb5.startGame(numberCode)));
    }
}
