package be.digitalcity.demo.java.exo;

import java.util.Scanner;

public class NombresPremiers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de nombres premiers: ");
        int x = scanner.nextInt();

        int compteur = 0;
        int nombre = 2; // Le premier nombre premier, nombre initial

        while (compteur < x) {
            if (NbPremier(nombre)) {
                System.out.println(nombre);
                compteur++;
            }
            nombre++;
        }
    }

    // 1er methode
    public static boolean NbPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}



