package be.digitalcity.demo.java.demo.demoEnum;

public enum Ville {
    LIEGE("4000"),
    BRUXELLES("1000"),
    LLN("1050");

    public String codePostal;

    Ville(String cp) {
        this.codePostal = cp;
    }

    public void show() {
        System.out.println( this.toString() + " - " + this.codePostal );
    }

}
