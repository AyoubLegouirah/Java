package be.digitalcity.demo.java.oo.exo5;

import be.digitalcity.demo.java.oo.exo6.Customer;

public interface Banker extends Customer {

    void appliquerInteret();
    Personne getTitulaire();
    String getNumero();

}