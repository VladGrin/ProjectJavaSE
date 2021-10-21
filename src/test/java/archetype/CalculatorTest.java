package archetype;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void sum() {
        final int sum = calculator.sum(10, 20);

        assertEquals(30, sum);

        assertThat(sum, is(30));
    }

    @Test
    public void dif() {
        final int sum = calculator.dif(10, 20);

        assertEquals(-10, sum);

        assertThat(sum, is(-10));
    }
}