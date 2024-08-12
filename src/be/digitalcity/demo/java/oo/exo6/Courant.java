package be.digitalcity.demo.java.oo.exo6;


import be.digitalcity.demo.java.oo.exo5.Compte;
import be.digitalcity.demo.java.oo.exo5.Personne;


public class Courant extends Compte {

    private double ligneDeCredit;

    public Courant(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    // region GET/SET

    public double getLigneDeCredit(){
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit){
        if( ligneDeCredit >= 0 )
            this.ligneDeCredit = ligneDeCredit;
    }

    // endregion

    // region METHODS

    @Override
    public void retrait(double montant){
        if( montant <= getSolde() + ligneDeCredit )
            super.retrait(montant);
    }

    @Override
    protected double calculInteret() {
        return 0;
    }

    // endregion

}

//