package be.digitalcity.demo.java.oo.exo5;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        try {

            Personne p = new Personne("luc", "dubois", LocalDate.EPOCH);

            Courant c = new Courant("1", p);
            Compte compte = c;
            Object o = c;

            c.setLigneDeCredit(100);
            compte.retrait(100);

            System.out.println(compte.getSolde()); // -100

            compte = new Epargne("2", p);
            compte.depot(200);
            compte.retrait(100);
            System.out.println(compte.getSolde()); // 100

            if (compte instanceof Epargne epargne) {
                System.out.println(
                        epargne.getDateDernierRetrait()
                );
            }
            System.out.println("solde avant interet : " + compte.getSolde());
            compte.appliquerInteret();
            System.out.println("solde après interet : " + compte.getSolde());


            System.out.println("solde avant interet : " + c.getSolde());
            c.appliquerInteret();
            System.out.println("solde après interet : " + c.getSolde());

            c.depot(209.75);

            System.out.println("solde avant interet : " + c.getSolde());
            c.appliquerInteret();
            System.out.println("solde après interet : " + c.getSolde());



        } catch (SoldeInsufisantException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}