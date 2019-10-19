import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz3Test {

    private FizzBuzz3 fb3;
    private String numberCode;
    private String speakCode;

    public FizzBuzz3Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initailObject() {
        fb3 = new FizzBuzz3();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzz3TestParameters() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"13","Fizz"},
                {"5","Buzz"},
                {"15","FizzBuzz"},
                {"52","Buzz"},
                {"51","FizzBuzz"},
                {"35","FizzBuzz"}
        });
    }


    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb3.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb3.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb3.isDivided("12","3")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb3.isDivided("13","0");
    }

    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb3.isContained("12","1")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb3.isFizz("12")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb3.isBuzz("15")));
    }


    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb3.startGame(numberCode)));
    }




}
