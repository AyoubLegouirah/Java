package be.digitalcity.demo.java.oo.exo3_1;

import java.time.LocalDate;

public abstract class Sportif extends Personne implements Competiteur {

    public Sportif(String prenom, String nom, LocalDate dateNaiss) {
        super(prenom, nom, dateNaiss);
    }

}