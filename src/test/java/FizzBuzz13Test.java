import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class FizzBuzz13Test {

    private String numberCode;
    private String speakCode;
    private FizzBuzz13 fb13;

    public FizzBuzz13Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initialObject() {
        fb13 = new FizzBuzz13();
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
    public void createNumbersTest() {
        assertThat(100,equalTo(fb13.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb13.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb13.isDivided("10","5")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb13.isDivided("10","0");
    }


    @Test
    public void isContainTest() {
        assertThat(true,equalTo(fb13.isContain("10","0")));
    }


    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb13.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb13.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb13.startGame(numberCode)));
    }



}
