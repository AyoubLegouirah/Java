package be.digitalcity.demo.java.oo.exo5;

import java.time.LocalDateTime;
import java.util.Objects;

public class Epargne extends Compte {

    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Personne titulaire){
        super( numero, titulaire );
    }

    // region GET/SET
    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }
    // endregion

    //region METHODS

    @Override
    public void retrait(double montant) {
        double soldePrec = getSolde();
        super.retrait(montant);
        if(soldePrec > getSolde()){
            setDateDernierRetrait(LocalDateTime.now());
        }
    }

    @Override
    protected double calculInteret() {
        return this.getSolde() * 0.045;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Epargne epargne = (Epargne) object;
        return Objects.equals(dateDernierRetrait, epargne.dateDernierRetrait);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dateDernierRetrait);
    }

    // endregion


}