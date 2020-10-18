package fizzbuzz;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(value = Parameterized.class)
public class FizzBuzz12Test {

    private String numberCode;
    private String speakCode;
    private FizzBuzz12 fb12;

    @Before
    public void initialObject() {
        fb12 = new FizzBuzz12();
    }

    public FizzBuzz12Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameters() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"2","2"},
                {"5","Buzz"},
                {"35","FizzBuzz"}
        });
    }


    @Test
    public void createNumbersTest() {
        MatcherAssert.assertThat(100,equalTo(fb12.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb12.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        MatcherAssert.assertThat(true,equalTo(fb12.isDivided("10","2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb12.isDivided("11","0");
    }


    @Test
    public void isContainTest() {
        MatcherAssert.assertThat(true,equalTo(fb12.isContain("11","1")));
    }

    @Test
    public void isFizzTest() {
        MatcherAssert.assertThat(true,equalTo(fb12.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        MatcherAssert.assertThat(true,equalTo(fb12.isBuzz("5")));
    }


    @Test
    public void startGameTest() {
        MatcherAssert.assertThat(speakCode,equalTo(fb12.startGame(numberCode)));
    }


}
