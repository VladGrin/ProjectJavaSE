package archetype.functionalinterfaces;

import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

    }
}
