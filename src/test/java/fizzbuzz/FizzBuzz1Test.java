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
public class FizzBuzz1Test {

    private FizzBuzz1 fb1;

    private String numberCode;
    private String speakCode;


    public FizzBuzz1Test(String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }


    @Before
    public void initialObject() {
        fb1 = new FizzBuzz1();
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzz1TestParameters() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"13","Fizz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"53","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb1.createNumbers(100).size()));
        assertThat("1",equalTo(fb1.createNumbers(100).get(0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersExceptionTest() {
        fb1.createNumbers(-1);
    }



    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb1.isDivided("15","3")));
    }


    @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb1.isDivided("12","0");
    }



    @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb1.isContained("13","1")));
    }

    @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb1.isFizz("13")));
        assertThat(true,equalTo(fb1.isFizz("9")));
    }

    @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb1.isBuzz("52")));
        assertThat(true,equalTo(fb1.isBuzz("15")));
    }

    @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb1.startGame(numberCode)));
    }
}
