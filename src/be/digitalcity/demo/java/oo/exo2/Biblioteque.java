package be.digitalcity.demo.java.oo.exo2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteque {
    String nom;
    List<Livre> livres = new ArrayList<>();

    Biblioteque(String nom) {
        this.nom = nom;
    }

    void ajouter(Livre livre ){
        livres.add(livre);
    }

    Livre chercherParTitre(String titre){
        for (Livre livre : livres) {
            if( livre.titre.equals( titre ))
                livres.remove(livre);
        }
        return null;
    }

    void retirer( Livre livre ){
        livres.remove( livre );
    }

    void retirerParNom( String titre ){
        Livre livre = this.chercherParTitre( titre );
        if( livre != null )
            this.retirer(livre);
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

