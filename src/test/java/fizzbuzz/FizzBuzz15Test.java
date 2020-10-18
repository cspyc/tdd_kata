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
public class FizzBuzz15Test {
    private String speakCode;
    private String numberCode;
    private FizzBuzz15 fb15;

    public FizzBuzz15Test(String numberCode,String speakCode) {
        this.speakCode = speakCode;
        this.numberCode = numberCode;
    }

    @Before
    public void initailObject() {
        fb15 = new FizzBuzz15();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameters() {
        return Arrays.asList(new String[][]{
                {"2","2"},
                {"3","Fizz"},
                {"5","Buzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });

    }

    @Test
    public void createNumberTest() {
        MatcherAssert.assertThat(100,equalTo(fb15.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumberExceptionTest() {
        fb15.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        MatcherAssert.assertThat(true,equalTo(fb15.isDivided("10","2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb15.isDivided("10","0");
    }

    @Test
    public void isContainTest() {
        MatcherAssert.assertThat(true,equalTo(fb15.isContain("10","0")));
    }

    @Test
    public void isFizzTest(){
        MatcherAssert.assertThat(true,equalTo(fb15.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        MatcherAssert.assertThat(true,equalTo(fb15.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        MatcherAssert.assertThat(speakCode,equalTo(fb15.startGame(numberCode)));
    }
}
