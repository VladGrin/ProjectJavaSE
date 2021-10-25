package archetype.except.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private final NumbersHandler handler = new NumbersHandler();

    public void run() {
        int number = RANDOM.nextInt(11);
        while (true) {
            System.out.println("Input number: ");
            int inputNumber = SCANNER.nextInt();
            boolean check = false;
            try {
                check = handler.check(number, inputNumber);
                if (check) {
                    break;
                } else {
                    System.out.println("Oops. Try again");
                }
            } catch (Exception e) {
                System.out.println("not valid number");
            }
        }
        System.out.println("You won!");
    }
}
