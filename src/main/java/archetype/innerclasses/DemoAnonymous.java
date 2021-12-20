package archetype.innerclasses;

import java.util.concurrent.TimeUnit;

public class DemoAnonymous {
    public static void main(String[] args) throws InterruptedException {

        Service service = new Service(){

            private static final String name = "Vasia";
            private int number;

            @Override
            public void service1() {
                number = 10;
                System.out.println("Anonymous service 1 " + this.name);
            }

            @Override
            public void service2() {
                System.out.println("Anonymous service 2 " + number);
            }
        };
        service.service1();
        service.service2();

        AbstrService abstrService = new AbstrService(20) {

            @Override
            public void serviceAction() {
                System.out.println("Servise anonymous action");
            }
        };
        abstrService.action();
        abstrService.serviceAction();

        Action action = new Action() {

            @Override
            public void action1() {
                System.out.println("Action 1");
            }

            @Override
            public void action2() {
                System.out.println("Action 2");
            }
        };
        action.action1();
        action.action2();
        action.defaultAction();
        Action.staticAction();
        System.out.println(Action.ACT);

    }
}
