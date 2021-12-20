package archetype.functionalinterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

public class DemoFunctionalInterfaces {
    public static void main(String[] args) {

        Calculator plus = (x, y) -> x + y;
        Calculator minus = (x, y) -> x - y;

        System.out.println(plus);

        int res = plus.calculate(10, 20);
        System.out.println(res);

        res = minus.calculate(50, 800);
        System.out.println(res);

        User user = new User(1, "Sasha");
        Copyable<User> copyable = entity -> new User(entity.getUid(), entity.getName());
        User copyUser = copyable.copy(user);
        System.out.println(user.equals(copyUser));

        int result = getResult(20, 30, (x, y) -> x * x + y * y);
        System.out.println(result);
        result = getResult(20, 30, (x, y) -> x * y + x * y);
        System.out.println(result);
    }

    public static int getResult(int x, int y, Calculator calculator){
        return calculator.calculate(x, y);
    }

    @Data
    @AllArgsConstructor
    private static class User {
        private int uid;
        private String name;

        public User(User user){
            uid = user.getUid();
            name = user.getName();
        }
    }
}
