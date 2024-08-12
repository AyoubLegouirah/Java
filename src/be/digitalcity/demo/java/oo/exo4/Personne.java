package be.digitalcity.demo.java.oo.exo4;

public class Personne {

    private String nom;
    private String prenom;
    private String dateDeNaissance;

    public Personne(String nom, String prenom, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    // Getters pour acceder au champs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    //Setters pour modifier les champs
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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