package be.digitalcity.demo.java.demo.boucles;

import java.util.Scanner;

public class ExoBoucle {
    public static void main(String[] args) {

        /*
        // 1 er exercise
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count++;
        }


        // 2e exercise
        int pair = 1;
        while (pair <= 10){
            if (pair % 2 == 0){
                System.out.println(pair);
            }
            pair ++;
        }

        // 3e exercise avec for
        for (int nombre = 1; nombre <= 10; nombre++){
            System.out.println(nombre);
        }



        // 4e exercise avec for multiple de 5
        for (int multiple = 5; multiple <= 50; multiple = multiple + 5){
            System.out.println(multiple);
        }



        // 5e exercise avec do while
        Scanner sc = new Scanner(System.in);
        String motDePasse = "Java123";
        boolean correct = false;
        do {
            System.out.println("Entrez votre mot de passe:");
            String saisie = sc.nextLine();
            if (saisie.equals(motDePasse)){
                System.out.println("Mot de passe correct!");
            }
            else {
                System.out.println("Mot de passe incorrect!");
            }
        }while (correct);



        // 6e exercise avec do while
        Scanner Scanner = new Scanner(System.in);
        int nombre;
        boolean juste = false;

        do{
            System.out.println("Entrez un nombre entre 1 et 10:");
            int saisie = Scanner.nextInt();
            if (saisie > 1 && saisie <= 10){
                System.out.println("Nombre correct!");
                juste = true;
            }
            else {
                System.out.println("Nombre incorrect!");
            }
        } while (juste);
         */

        // Exercise avec for each
        // Crée une liste d'entiers contenant les nombres de 1 à 10.
        // Utilise une boucle for-each pour afficher chaque nombre de la liste.

        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int nombre : tableau){
            System.out.println(nombre);
        }


        // Exercise 2
        // Utilisation d'un itérateur avec une liste
        //
        //Crée une liste de chaînes de caractères contenant des noms de fruits.
        //Utilise un itérateur pour parcourir la liste et afficher chaque fruit.

        String [] fruits = {"pomme", "banane", "orange", "abricot", "poire"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        // Exercise 3
        // Prends un tableau d'entiers et utilise une boucle for-each pour calculer la somme des éléments.

        int[] tableau2 = {1, 2, 3, 4, 5};
        int somme = 0;
        for (int nombres : tableau2){
            somme = somme + nombres;
        }

        System.out.println("Somme des nombres : " + somme);






    }
}
