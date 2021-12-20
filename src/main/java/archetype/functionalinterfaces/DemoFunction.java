package archetype.functionalinterfaces;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        Function<Integer, String> function = num -> "Your number is " + num;
        String str = function.apply(58);
        System.out.println(str);
    }
}
