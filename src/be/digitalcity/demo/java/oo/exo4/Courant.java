package be.digitalcity.demo.java.oo.exo4;

public class Courant {

    private String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;

    public Courant(String numero, double solde, double ligneDeCredit, Personne titulaire) {
        this.numero = numero;
        this.solde = solde;
        this.titulaire = titulaire;
        this.setLigneDeCredit(ligneDeCredit);
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        if (ligneDeCredit >= 0){
            this.ligneDeCredit = ligneDeCredit;
        } else {
            System.out.println("Ligne de crédit ne peut pas être négative");
        }
    } // Modifiable  donc c'est pour ca qu'on fait un set

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    } // Modifiable  donc c'est pour ca qu'on fait un set


    public void retrait (double montant){
        if (montant > 0 && solde - montant >= ligneDeCredit){
            // si le solde moins le montant est superieur a la ligne de credit retrait autorié
            solde = montant - solde;
            System.out.println("Retrait de " + montant + " effectué. Il te reste : " + solde);
        }
        else {
            System.out.println("Impossible de réaliser le retrait");
        }
    }
    public void depot (double montant){
        if (montant > 0){
            solde = montant + solde;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
        }
        else {
            System.out.println("Impossible de réaliser le dépôt");
        }
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