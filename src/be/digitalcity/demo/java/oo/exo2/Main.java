package be.digitalcity.demo.java.oo.exo2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Biblioteque b = new Biblioteque("Ma Bibli");
        Livre l = new Livre("blabla","blabla",LocalDate.now());
        l = new Livre("toto", "toto");

        b.ajouter(l);
//        b.retirer( b.chercherParTitre("blabla") );
        b.retirerParNom("blabla");

    }

}


//Exo OO 2
//Créez un système de gestion de Bibliothèque.
//
//Il sera possible de:
//rajouter un Livre dans un Bibliothèque.
//chercher un Livre par rapport à son titre.
//supprimer un Livre de la Bibliothèque.
//
//Le Livre possède:
//un titre
//un auteur(string)
//une date de parution
//
//La Bibliothèque possède:
//un nom
//une liste de livre
//les méthodes permettant les fonctionnalités citées plus haut.

