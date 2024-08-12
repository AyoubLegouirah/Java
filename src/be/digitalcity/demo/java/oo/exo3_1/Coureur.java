package be.digitalcity.demo.java.oo.exo3_1;

import java.time.LocalDate;
import java.util.Random;

public class Coureur extends Sportif {

    private double coeffCourse;

    public Coureur(String prenom, String nom, LocalDate dateNaiss, double coeffCourse) {
        super(prenom, nom, dateNaiss);
        this.coeffCourse = coeffCourse;
    }


    @Override
    public double performer() {
        return coeffCourse * new Random().nextDouble(2,5);
    }
}