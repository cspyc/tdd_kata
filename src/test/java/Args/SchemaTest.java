package Args;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaTest {
    @Test
    public void get_value_type_test() {
        Schema schema = new Schema();
        assertThat("boolean",is(schema.getValueType("l")));
        assertThat("integer",is(schema.getValueType("p")));
        assertThat("string",is(schema.getValueType("d")));

    }
}
