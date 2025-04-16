package Exceptions;

public class KeyNotFound  extends Exception{


    public KeyNotFound(String message) {
        this(message,null);
    }

    public KeyNotFound(String message, Throwable e) {
        super(message,e);
    }
}
