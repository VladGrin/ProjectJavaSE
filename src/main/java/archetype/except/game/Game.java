package archetype.except.game;


import archetype.except.game.exception.InvalidNumberException;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private final NumbersHandler handler = new NumbersHandler();

    public void run() {
        int number = RANDOM.nextInt(11);
        while (true) {
            int inputNumber = SCANNER.nextInt();
            boolean check = false;
            try {
                check = handler.check(number, inputNumber);
                if (check) break;
                System.out.println("Try again");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("You won!");
    }
}
