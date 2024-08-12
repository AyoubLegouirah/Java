package be.digitalcity.demo.java.oo.exo5;
import java.time.LocalDateTime;

public abstract class Compte implements Banker {
    private final String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    // region GET/SET
    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        if (titulaire != null)
            this.titulaire = titulaire;
        else
            throw new RuntimeException();
    }
    // endregion

    // region METHODS

    @Override
    public void retrait(double montant) {
        retrait(montant, 0);
    }

    public void retrait(double montant, double limit) {
        if (montant <= 0) {
            throw new IllegalArgumentException("montant must be greater than 0");
        }
        if (montant > getSolde() + limit) {
            throw new SoldeInsufisantException();
        }
        solde -= montant;
    }

    @Override
    public void depot(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("montant must be greater than 0");
        }
        solde += montant;
    }

    protected abstract double calculInteret();

    @Override
    public void appliquerInteret() {
        setSolde(getSolde() + calculInteret());
    }
}
// endregion

// Définir la classe « Compte » comme étant abstraite.
//
//Ajouter une méthode abstraite « protected » à la classe « Compte » appelée « calculInteret » ayant pour prototype
// « double calculInteret() »
//en sachant que pour un livret d’épargne le taux est toujours de 4.5% tandis que pour le compte courant si le solde
// est positif le taux sera de 3% sinon de 9.75%.
//
//Ajouter une méthode « public » à la classe « Compte » appelée « appliquerInteret » qui additionnera le solde avec
// le retour de la méthode « calculInteret ».