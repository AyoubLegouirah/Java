package be.digitalcity.demo.java.oo.BaseOOP;

public class Voiture {
    String marque = "Mark";
    String modele;
    int kmParcouru;

    void seDeplacer(int kmParcouru){
        System.out.println( this.marque );
        this.kmParcouru += kmParcouru;
    }



}

// C'est quoi l'encapsulation?
// Encapsulation est une principe de programmation orientée objet (OOP) dans lequel les données
// et les méthodes sont cachées et accessibles uniquement à l' objet auquel ils sont liés.'
// C'est des getter et setter
