package archetype;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DemoStringTest {


    @Test
    public void whenCompareStringRefsThenReurnTrue() {
        String str1 = "java";
        String str2 = "java";

        assertThat(str1 == str2, is(true));
    }

    @Test
    public void intern() {
        String str1 = "java";
        String str2 = new String(str1);

        assertThat(str1 == str2, is(false));

        str2 = str2.intern();

        assertThat(str1 == str2, is(true));
    }

    @Test
    public void constructFromCharArray() {
        char[] arr = {'j', 'a', 'v', 'a'};

        assertThat(new String(arr), is("java"));
    }

    @Test
    public void constructFromByteArray() {
        byte[] arr = {97, 98, 99, 100};

        assertThat(new String(arr), is("abcd"));
    }

    @Test
    public void length() {

        assertThat("java".length(), is(4));
    }

    @Test
    public void isEmpty() {
        String str = "";

        assertThat(str.isEmpty(), is(true));

        str = "java";

        assertThat(str.isEmpty(), is(false));
    }

    @Test
    public void toUpperCase() {

        final String actual = "java".toUpperCase();
        assertThat(actual, is("JAVA"));
    }

    @Test
    public void toLowerCase() {

        assertThat("JaVa".toLowerCase(), is("java"));
    }

    @Test
    public void trim() {
        String str = "    123456       ";

        assertThat(str.trim(), is("123456"));
    }

    @Test
    public void replaceAll() {
        String str = "   JA     VA     ";
        String res = str.replaceAll(" ", "");

        assertThat(res, is("JAVA"));
    }

    @Test
    public void startsWithReturnTrue() {
        assertThat("java".startsWith("ja"), is(true));
    }

    @Test
    public void startsWithReturnFalse() {
        assertThat("java".startsWith("hy"), is(false));
    }

    @Test
    public void indexOf() {
        final int v = "java".indexOf("v");

        assertThat(v, is(2));
    }

    @Test
    public void substring() {
        final String substring = "java".substring(0, 2);

        assertThat(substring, is("ja"));
    }

    @Test
    public void split() {
        String[] strings = "Vlad-aMax-aBob".split("-a");

        assertThat(strings.length, is(3));
        assertThat(strings[0], is("Vlad"));
        assertThat(strings[2], is("Bob"));
    }

    @Test
    public void format() {
        final String str = String.format("java %s %d", "SE", 11);

        assertThat(str, is("java SE 11"));
    }

    @Test
    public void join() {
        String join = String.join(", ", "Vlad", "Max", "Bob");

        assertThat(join, is("Vlad, Max, Bob"));
    }

    @Test
    public void concat(){
        String actual = "Java " + "SE";

        assertThat(actual, is("Java SE"));
        assertThat(5 * 5 + "abc", is("25abc"));
    }
}
