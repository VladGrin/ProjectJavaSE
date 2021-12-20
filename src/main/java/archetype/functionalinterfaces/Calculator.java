package archetype.functionalinterfaces;

@FunctionalInterface
public interface Calculator {

    int calculate(int a, int b);


    default void action(){

    }
    static void statAct(){

    }

}
