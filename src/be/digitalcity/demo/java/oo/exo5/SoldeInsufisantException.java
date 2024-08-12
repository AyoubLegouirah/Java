package be.digitalcity.demo.java.oo.exo5;

public class SoldeInsufisantException extends RuntimeException{

    public int statusCode = 404;

    public SoldeInsufisantException() {
        super("Solde insufisant");
    }

    public SoldeInsufisantException(String message) {
        super(message);
    }
}