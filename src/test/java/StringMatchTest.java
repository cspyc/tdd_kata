import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StringMatchTest {

    @Test
    public void if_string_all_contains_number_return_true_test() {
        StringMatch smObj = new StringMatch();
        Assert.assertEquals(true,smObj.if_string_all_contains_number_return_true("252195"));
    }
}
