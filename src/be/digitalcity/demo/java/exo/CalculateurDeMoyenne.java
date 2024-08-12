package be.digitalcity.demo.java.exo;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateurDeMoyenne {
    public static void main(String[] args) {

        // Créez un Créez un programme permettant à un utilisateur d'entrer autant de nombre qu'il souhaite.
        // Une fois qu'il arrête d'écrire des chiffres, calculez la moyenne de ses nombres.

        /*
        do {
            System.out.println(
                    "Je vais te donner la moyenne des nombres que tu peux entrer autant que tu veux." +
                            "Tu peux quitter en tapant 'q' ");

            String NombreUtilisateur = sc.nextLine();

            int entier;
            if (sc.hasNextInt()) {
                entier = sc.nextInt();
            } else {
                String mot = sc.next();
            }
            if (NombreUtilisateur.equals("q")) {
                break;
            }

            if (  ) {
                int numero = Integer.parseInt(NombreUtilisateur);
                tableau.add(numero);
            } else {
                System.out.println("C'est pas correct'");
            }

        }while (true);
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tableau = new ArrayList<>();

        while (true) {
            System.out.println(
                    "Je vais te donner la moyenne des nombres que tu peux entrer autant que tu veux." +
                            "Tu peux quitter en tapant 'q'.");

            String nombreUtilisateur = sc.nextLine();

            if (nombreUtilisateur.equals("q")) {
                break;
            }

            Scanner inputScanner = new Scanner(nombreUtilisateur);
            if (inputScanner.hasNextInt()) {
                int nombre = inputScanner.nextInt();
                tableau.add(nombre);
            } else {
                System.out.println("Ce n'est pas un nombre valide. Merci de recommencer.");
            }
            inputScanner.close();
        }

        // for each pour calculer la moyenne

        if (!tableau.isEmpty()) {
            int somme = 0;
            for (int nombre : tableau) {
                somme += nombre;
            }
            double moyenne = (double) somme / tableau.size();
            System.out.println("La moyenne des nombres est : " + moyenne);
        } else {
            System.out.println("Aucun nombre n'a été entré.");
        }



    }
}

