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
public class FizzBuzzTest {

    private FizzBuzz fb;
    private String number;
    private String speackCode;

    @Before
    public void iniObj() {
        fb = new FizzBuzz();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameters() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"13","Fizz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"53","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    public FizzBuzzTest(String number,String speakCode) {
        this.number = number;
        this.speackCode = speakCode;
    }


    @Test
    public void createNumbersTest() {
        assertThat("1",equalTo(fb.createNumbers(100).get(0)));
    }


    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb.createNumbers(-1);
    }

    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb.isDivided("15","5")));
        assertThat(false,equalTo(fb.isDivided("13","2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDivideExceptionTest() {
        fb.isDivided("12","0");
    }

    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb.isContained("11","1")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb.isFizz("9")));
        assertThat(true,equalTo(fb.isFizz("13")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb.isBuzz("10")));
        assertThat(true,equalTo(fb.isBuzz("51")));
    }


    @Test
    public void startGameTest() {
        assertThat(speackCode,equalTo(fb.startGame(number)));
    }

}
