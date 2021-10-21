package archetype;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DemoDataFormatTest {

    @Test
    public void dataFormat() {
        DateFormat dateFormatUa = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("ua", "UA"));
        DateFormat dateFormatRu = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.MEDIUM, new Locale("ru", "RU"));
        DateFormat dateFormatBy = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.FULL, new Locale("be", "BY"));
        Date date = new Date();
        System.out.println(date);

        final String formatBy = dateFormatBy.format(date);
        System.out.println(formatBy);
        final String formatUa = dateFormatUa.format(date);
        System.out.println(formatUa);
        final String formatRu = dateFormatRu.format(date);
        System.out.println(formatRu);

        try {
            final Date parse = dateFormatBy.parse("панядзелак, 28, кастрычніка 2021 22.22.22 EEST");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
