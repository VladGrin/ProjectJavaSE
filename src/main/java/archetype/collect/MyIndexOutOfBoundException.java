package archetype.collect;

public class MyIndexOutOfBoundException extends RuntimeException{
    public MyIndexOutOfBoundException() {
        super();
    }

    public MyIndexOutOfBoundException(String message) {
        super(message);
    }

    public MyIndexOutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
