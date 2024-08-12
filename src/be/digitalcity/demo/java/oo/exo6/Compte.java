package be.digitalcity.demo.java.oo.exo6;


public class Compte extends Object implements Customer {
    private final String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    // region GET/SET
    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }


    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        if( titulaire != null )
            this.titulaire = titulaire;
        else
            throw new RuntimeException();
    }
    // endregion

    // region METHODS

    public void retrait(double montant){
        if( montant > 0 )
            solde -= montant;
    }


    public void depot(double montant){
        if( montant > 0 )
            solde+= montant;
    }




    // endregion
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
