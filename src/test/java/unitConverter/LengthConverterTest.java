package unitConverter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 2020/11/25 11:19 PM
 **/
public class LengthConverterTest {
    @Test
    public void should_12_inch_when_input_1_foot() throws Exception {
        LengthConverter lengthConverter = new LengthConverter();
        assertThat(lengthConverter.convertUnitToInch(1, "foot"), is(12));
    }

    @Test
    public void should_return_36_inch_when_input_1_yard() throws Exception {
        LengthConverter lengthConverter = new LengthConverter();
        assertThat(lengthConverter.convertUnitToInch(1, "yard"), is(36));
    }

    @Test
    public void should_return_3_foot_when_input_1_yard() throws Exception {
        LengthConverter lengthConverter = new LengthConverter();
        assertThat(lengthConverter.convertUnitToFoot(1,"yard"),is(3));
    }
}
