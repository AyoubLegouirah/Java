package be.digitalcity.demo.java.oo.exo8;

import java.util.ArrayList;
import java.util.List;

public class Carwash {

    List<ActionVoiture<Voiture>> myEvents = new ArrayList<>();

    private void preparer(Voiture v) {
        System.out.println("je prépare la voiture : " + v.getPlaque());
    }


    private void laver(Voiture v) {
        System.out.println("je lave la voiture : " + v.getPlaque());
    }

    private void secher(Voiture v) {
        System.out.println("je sèche la voiture : " + v.getPlaque());
    }

    private void finaliser(Voiture v) {
        System.out.println("je finalise la voiture : " + v.getPlaque());
    }

    public void traiter(Voiture v){
        myEvents.add((vo) -> preparer(vo));
        myEvents.add((vo) -> laver(vo));
        myEvents.add((vo) -> secher(vo));
        myEvents.add((vo) -> finaliser(vo));

        myEvents.forEach((e) -> e.execute(v) );

        // Tu peux aussi utiliser une version avec un foreach() pour simplifier l'écriture de la voiture'
        /*
        for(ActionVoiture<Voiture> a : myEvents){
            a.execute(v);
        }
         */

    }


}


/*
Créer une classe Carwash contenant 5 méthodes
 private void Préparer(Voiture v) qui affiche « je prépare la voiture : {plaque} »
 private void Laver(Voiture v) qui affiche « je lave la voiture : {plaque} »
 private void Secher(Voiture v) qui affiche « je sèche la voiture : {plaque} »
 private void Finaliser(Voiture v) qui affiche « je finalise la voiture : {plaque} »
 public void Traiter(Voiture v) qui exécute les 4 méthodes précédentes dans l’ordre à l’aide d’une List<ActionVoiture>.
 */