package archetype.functionalinterfaces;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
//        Consumer<String> consumer = s -> {
//            StringBuilder builder = new StringBuilder(s);
//            StringBuilder reverse = builder.reverse();
//            System.out.println(reverse);
//        };
//        consumer.accept("asdfghjkl");

        handler("Hello", s -> {
            StringBuilder builder = new StringBuilder(s);
            StringBuilder reverse = builder.reverse();
            System.out.println(reverse);
        });
    }

    public static void handler(String s, Consumer<String> consumer){
        consumer.accept(s);
    }
}
