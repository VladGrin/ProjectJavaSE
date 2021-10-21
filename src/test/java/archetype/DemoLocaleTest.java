package archetype;

import org.junit.Test;

import java.util.Locale;

public class DemoLocaleTest {

    @Test
    public void localization() {
        Locale localeGe = Locale.GERMAN;
        System.out.println(localeGe);
        Locale aDefault = Locale.getDefault();
        System.out.println(aDefault);
        Locale localeBy = new Locale("uk", "UA");
        System.out.println(localeBy.getDisplayCountry());
        System.out.println(localeBy.getDisplayLanguage());
        Locale.setDefault(localeBy);
        aDefault = Locale.getDefault();
        System.out.println(aDefault);
    }
}
