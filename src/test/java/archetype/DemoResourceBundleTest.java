package archetype;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundleTest {

    @Test
    public void getBundleProperties() {
        Locale locale = new Locale("de", "DE");
        Locale.setDefault(locale);

        ResourceBundle bundle = ResourceBundle.getBundle("res.text");

        final String value1 = bundle.getString("str1");
        System.out.println(value1);

        final String value2 = bundle.getString("str2");
        System.out.println(value2);

        for (String s : bundle.keySet()) {
            System.out.println(s);
        }
    }

}
