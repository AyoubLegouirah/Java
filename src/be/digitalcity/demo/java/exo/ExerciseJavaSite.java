package be.digitalcity.demo.java.exo;

import java.util.Scanner;

public class ExerciseJavaSite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une premiere valeur");
        int m = scanner.nextInt();

        System.out.println("Entrez une deuxieme valeur");
        int n = scanner.nextInt();

        int produit = m*n;

        if (produit > 0) {
            System.out.println("Le produit est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit est négatif.");
        } else {
            System.out.println("Le produit est nul.");
        }



    }
}
