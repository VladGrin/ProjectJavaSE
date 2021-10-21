package archetype;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DemoPatternTest {

    @Test
    public void split() {
        Pattern pattern = Pattern.compile("\\w{3,}@\\w{3,}.\\w{2,4}");

        String[] split = pattern.split("text1 vlad@gmail.com text2 vlad@rambler.ru text3");
        assertThat(split.length, is(3));
        assertThat(split[0], is("text1 "));
    }

    @Test
    public void matchesTrue(){
        final boolean matches = Pattern.matches("\\w{3,}@\\w{3,}.\\w{2,4}",
                "vlad@gmail.com");

        assertThat(matches, is(true));
    }

    @Test
    public void matchesFalse(){
        final boolean matches = Pattern.matches("\\w{3,}@\\w{3,}.\\w{2,4}",
                "vladgmail.com");

        assertThat(matches, is(false));
    }

    @Test
    public void matchesSymbolsAndDigitals(){
        final boolean matches = Pattern.matches("\\w+","vladgmailcom");

        assertThat(matches, is(true));
    }
}
