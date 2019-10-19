import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz2Test {
    private String numberCode;
    private String speakCode;
    private FizzBuzz2 fb2;

    @Before
    public void initialObject() {
        fb2 = new FizzBuzz2();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzz2TestParameters() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"5","Buzz"},
                {"35","FizzBuzz"},
                {"15","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    public FizzBuzz2Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }


    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb2.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb2.createNumbers(-1);
    }


    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb2.isDivided("15","3")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb2.isDivided("13","0");
    }


    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb2.isContained("15","5")));
    }


    @Test
    public void isFizzTest(){
        assertThat(true,equalTo(fb2.isFizz("15")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb2.isBuzz("25")));
    }


    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb2.startGame(numberCode)));
    }
}
