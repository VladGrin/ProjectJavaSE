package archetype.innerclasses;

public class Owner {
    private int value = 1;
    public void action() {
        int a = 2;
        class InnerAction{
            int inner = value;
            int inn = a;
            // method
        }
        final InnerAction innerAction = new InnerAction();
    }

    public static void staticAction() {
        int b = 3;
        class StaticInnerAction{
            int c = b;
//            int inner = value;
        }
        final StaticInnerAction staticInnerAction = new StaticInnerAction();
    }
}
