package be.digitalcity.demo.java.exo;

import java.util.*;

public class ExoMap {
    public static void main(String[] args) {

        // Créer une application de gestion de panier de produit.
        // Tant qu'il le souhaite, l'utilisateur peut ajouter des produits à son panier, (1 à la fois)
        // Lorsqu'il a fini, on affiche le contenu de son panier
        // Déclarez une Map pour stocker les produits avec leur prix

        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> catalogue = new HashMap<>();
        List<String> panier = new ArrayList<>();

        catalogue.put("Pomme", 10);
        catalogue.put("Poire",12);
        catalogue.put("Fraise", 8);

        boolean quit = false;

        while (!quit) {

            System.out.println("Voici le catalogue : ");

            for (Map.Entry<String, Integer> entry : catalogue.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("Entrez le nom du produit à ajouter à votre panier (ou tapez 'fin' pour terminer) :");
            String reponse = sc.nextLine();
            if (reponse.equalsIgnoreCase("fin" )) {
               quit = true;
            }
            else if (catalogue.containsKey(reponse)) {
                panier.add(reponse);
            } else {
                System.out.println("Il existe pas");
            }
        }

        System.out.println(panier);




    }
}
