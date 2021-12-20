package archetype.innerclasses;

import java.io.Serializable;

public interface Action {
    public static final String ACT = "ACT";

    void action1();
    void action2();

    default void defaultAction(){
        System.out.println("Default action");
    }

    static void staticAction() {
        System.out.println("Static Action");
    }
}
abstract class WorkOut implements Action{

}
class MyWorkOut extends WorkOut implements Serializable, Comparable {

    @Override
    public void action1() {
        //
    }

    @Override
    public void action2() {
        //
    }

    @Override
    public void defaultAction() {
        System.out.println("My default action");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
