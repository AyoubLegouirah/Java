package be.digitalcity.demo.java.oo.exo5;



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
        if( ligneDeCredit < 0 ){
            throw new RuntimeException("Ligne de credit negatif");
        }
        this.ligneDeCredit = ligneDeCredit;
    }

    // endregion

    // region METHODS

    @Override
    public void retrait(double montant){
        super.retrait(montant,getLigneDeCredit());
    }

    @Override
    protected double calculInteret() {
        return (getSolde() > 0 ? 0.03 : 0.0975) * getSolde();
    }

    // endregion

}

//