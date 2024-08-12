package be.digitalcity.demo.java.oo.exo3;

public class Main {
    public static void main(String[] args) {
        Competition c = new Competition(3,12);
        Personne p1 = new Personne("John", "Doe");
        Personne p2 = new Personne("Jane", "Doe");
        Personne p3 = new Personne("Jack", "Doe");
        Personne p4 = new Personne("Jill", "Doe");

        c.ajouterParticipant(p1);
        c.ajouterParticipant(p2);
        c.ajouterParticipant(p3);
        c.ajouterParticipant(p4);

        c.lancerCompetition();



    }

}
