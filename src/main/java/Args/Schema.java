package Args;

import java.util.HashMap;
import java.util.Map;

public class Schema {
    private final Map<String,String> arguments = new HashMap<>();

    {
        arguments.put("l","boolean");
        arguments.put("p","integer");
        arguments.put("d","string");
    }


    public String getValueType(String l) {
        return arguments.get(l);
    }
}
