package String;

public class StringApi {

    public String toUpcase(String strTest) {
        return strTest.toUpperCase();
    }

    public String concatenationByPlus_symbol(String... strings) {
        String result = new String();
        for (String str : strings) {
            result += str;
        }
        return result;
    }
}
