package be.digitalcity.demo.java.oo.HeritageOOP;

public class Garage<T extends Vehicule>  {

    private T vehiculeGare;

    public T getVehiculeGare() {
        return vehiculeGare;
    }

    public void setVehiculeGare(T vehiculeGare) {
        this.vehiculeGare = vehiculeGare;
    }

    public void parker(T vehiculeGare){
        if (vehiculeGare!= null)
            throw new RuntimeException();

        setVehiculeGare(vehiculeGare);
        vehiculeGare.seGarer();
    }

    public T quitterGarage(){
        if (vehiculeGare == null)
            throw new RuntimeException();

        T vehicule = getVehiculeGare();
        setVehiculeGare(null);
        return vehicule;
    }



}

