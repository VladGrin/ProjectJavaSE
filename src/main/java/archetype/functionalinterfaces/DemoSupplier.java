package archetype.functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return RANDOM.nextInt(100);
            }
        };

        System.out.println(supplier.get());
    }
}
