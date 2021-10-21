package archetype;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoStringBuilderTest {

    @Test
    public void benchmarkStringBuilder() {

        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            builder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Method duration: " + (end - start));
        // Method duration: 20838 mc
        //Method duration: 14 mc
    }

    @Test
    public void append() {
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" SE");

        assertThat(new String(builder), is("Java SE"));
    }

    @Test
    public void insert() {
        StringBuilder builder = new StringBuilder("Java");
        builder.insert(2, "super");

        assertThat(new String(builder), is("Jasuperva"));
    }

    @Test
    public void reverse() {
        StringBuilder builder = new StringBuilder("Java");
        builder.reverse();

        assertThat(new String(builder), is("avaJ"));
    }
}
