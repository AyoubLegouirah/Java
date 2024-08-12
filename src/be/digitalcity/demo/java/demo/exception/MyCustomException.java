package be.digitalcity.demo.java.demo.exception;

public class MyCustomException extends RuntimeException{

    public MyCustomException() {
        super("Custom Exception");
    }

    public MyCustomException(String message) {
        super(message);
    }


}