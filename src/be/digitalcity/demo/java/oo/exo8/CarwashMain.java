package be.digitalcity.demo.java.oo.exo8;

public class CarwashMain {
    public static void main(String[] args) {
        Carwash carwash = new Carwash();
        Voiture v = new Voiture("ABC123");
        carwash.traiter(v);
    }
}
