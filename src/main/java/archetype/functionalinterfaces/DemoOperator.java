package archetype.functionalinterfaces;

import java.util.function.UnaryOperator;

public class DemoOperator {
    public static void main(String[] args) {
        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.substring(0, 3);
            }
        };
        System.out.println(operator.apply("dgsgsgsr"));
    }
}
