package be.digitalcity.demo.java.oo.exo6;

public interface Customer {
    double getSolde();
    void retrait(double montant);
    void depot(double montant);


}


// Exo Interface

//Définir l’interface « Customer », afin de limiter l’accès à consulter la propriété « solde »
// et d’utiliser les méthodes « depot » et « retrait ».
//
//Définir l’interface « Banker » ayant les mêmes fonctionnalités que « Customer ».
//
//Elle lui permettra, en plus, d’invoquer la méthode du « appliquerInteret » et offrira un accès en
// lecture au « titulaire » et au « numero ».
//
//Ajouter ces deux interfaces à la classe Compte.
//
//Si nous ajoutions l'accès à la « ligneDeCredit » à « Banker », définir sur papier les modifications
// qu’il faudrait apporter à nos classes.