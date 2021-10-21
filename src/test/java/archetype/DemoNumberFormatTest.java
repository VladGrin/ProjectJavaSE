package archetype;

import org.junit.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DemoNumberFormatTest {

    @Test
    public void numberFormat(){
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);

        String source = "1.234,567";

        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);

            final String formatUs = numberFormatUs.format(number);
            System.out.println(formatUs);

            final String formatFr = numberFormatFr.format(number);
            System.out.println(formatFr);


        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
