package be.digitalcity.demo.java.oo.exo4;

public class Main {
    public static void main(String[] args) {
        Courant c = new Courant("1234567" , 100, 0, new Personne("Ayoub", "Legouirah", "06-09-2000"));
        c.retrait(200);
        c.depot(300);
    }
}



// Exo Encapsulation
// Encapsulez les champs de la classe Personne
// Une Personne peut changer de nom et prénom mais pas de date de naissance.

//Créer une classe « Courant » permettant la gestion d’un compte courant qui devra implémenter

//Les propriétés:
//numero (string)
//solde (double) - Lecture seule
//ligneDeCredit (double) - représentant la limite négative du compte strictement supérieur ou égale à 0
//titulaire (Personne)

//Les méthodes publiques :
//void retrait(double montant){ ... }
//void depot(double montant){ ... }