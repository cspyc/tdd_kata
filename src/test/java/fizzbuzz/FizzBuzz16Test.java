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
public class FizzBuzz16Test {

    private String numberCode;
    private String speakCode;
    private FizzBuzz16 fb16;

    public FizzBuzz16Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Before
    public void initailObject() {
        fb16 = new FizzBuzz16();
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
        assertThat(100,equalTo(fb16.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb16.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb16.isDivided("10","2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb16.isDivided("10","0");
    }

    @Test
    public void isContainTest() {
        assertThat(true,equalTo(fb16.isContain("10","1")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb16.isFizz("3")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb16.isBuzz("5")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb16.startGame(numberCode)));
    }

}
