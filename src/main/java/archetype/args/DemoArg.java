package archetype.args;

import java.util.Arrays;
import java.util.Properties;

public class DemoArg {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        Properties properties = System.getProperties();
        properties.put("AAA_Param", "VALUE@");
        properties.list(System.out);

    }
}
