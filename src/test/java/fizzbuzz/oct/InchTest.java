package fizzbuzz.oct;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/10/28 12:24 AM
 **/
public class InchTest {
    @Test
    public void should_create_one_inch_object() throws Exception {
        Inch inch = new Inch(1);
    }

    @Test
    public void should_return_true_one_foot_equals_12_inches() throws Exception {
        Foot foot = new Foot(1);
        Inch inch = new Inch(12);
        assertThat(foot.getInchLength(), is(inch.getLength()));
    }
}
