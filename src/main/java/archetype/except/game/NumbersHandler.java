package archetype.except.game;

public class NumbersHandler {
    public boolean check(int number, int inputNumber) throws Exception {
        if(inputNumber < 0 || inputNumber > 10) {
            throw new Exception("number not valid");
        }
        return number == inputNumber;
    }
}
