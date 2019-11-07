package String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringApiTest {

    @Test
    public void create_new_string_object_when_manipulate_string() {
        StringApi stringApi = new StringApi();
        String strTest = "abz";
        assertNotSame(strTest,stringApi.toUpcase(strTest));
    }

    @Test
    public void concatenation_string_plus_symbol() {
        StringApi stringApi = new StringApi();
        assertEquals("abc123dd",stringApi.concatenationByPlus_symbol("abc","123","dd"));
        assertEquals("135kk",stringApi.concatenationByPlus_symbol("1","35","k","k"));
    }
}
