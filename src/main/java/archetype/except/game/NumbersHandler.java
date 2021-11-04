package archetype.except.game;


import archetype.except.game.exception.InvalidNumberException;

public class NumbersHandler {

    public boolean check(int number, int inputNumber) throws InvalidNumberException {
        if(inputNumber < 0 || inputNumber > 10) {
            throw new InvalidNumberException("number not valid");
        }
        return number == inputNumber;
    }
}
