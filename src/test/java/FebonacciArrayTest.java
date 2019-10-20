import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FebonacciArrayTest {
    private FebonacciArray febonacciArray;

    @Before
    public void initialObj() {
        febonacciArray = new FebonacciArray();
    }

    @Test
    public void should_return_1_when_position_1() {
        assertThat(1,is(febonacciArray.returnArrayNumber(1)));
    }

    @Test
    public void should_return_2_when_position_3() {
        assertThat(2,is(febonacciArray.returnArrayNumber(3)));
    }

}
