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
public class FizzBuzz9Test {

    private FizzBuzz9 fb9;
    private String numberCode;
    private String speakCode;

    public FizzBuzz9Test (String numberCode,String speakCode) {
        this.numberCode = numberCode;
        this.speakCode = speakCode;
    }

    @Parameterized.Parameters
    public static Collection<String[]> getFizzBuzzTestParameter() {
        return Arrays.asList(new String[][] {
                {"3","Fizz"},
                {"5","Buzz"},
                {"15","FizzBuzz"},
                {"35","FizzBuzz"},
                {"51","FizzBuzz"}
        });
    }

    @Before
    public void initialObject() {
        fb9 = new FizzBuzz9();
    }

    @Test
    public void createNumbersTest() {
        assertThat(100,equalTo(fb9.createNumbers(100).size()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumbersException() {
        fb9.createNumbers(-1);
    }


    @Test
    public void isDividedTest() {
        assertThat(true,equalTo(fb9.isDivided("10","5")));
    }

   @Test(expected = IllegalArgumentException.class)
    public void isDividedExceptionTest() {
        fb9.isDivided("10","0");
   }

   @Test
    public void isContainedTest() {
        assertThat(true,equalTo(fb9.isContained("16","6")));
   }

   @Test
    public void isFizzTest() {
        assertThat(true,equalTo(fb9.isFizz("3")));
   }

   @Test
    public void isBuzzTest() {
        assertThat(true,equalTo(fb9.isBuzz("5")));
   }

   @Test
    public void startGameTest() {
        assertThat(speakCode,equalTo(fb9.startGame(numberCode)));
   }


}
