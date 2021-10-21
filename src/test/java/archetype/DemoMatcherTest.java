package archetype;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoMatcherTest {

    @Test
    public void matcherFind() {
        Pattern pattern = Pattern.compile("\\w{3,}@\\w{3,}.\\w{2,4}");
        Matcher matcher = pattern.matcher("email:vlad@gmail.com, vlad@rambler.ru");
        System.out.println("lookingAt " + matcher.lookingAt());
        while (matcher.find()) {
            System.out.println("start " + matcher.start());
            System.out.println("group " + matcher.group());
            System.out.println("end " + matcher.end());
        }
    }
}
