package be.digitalcity.demo.java.exo;

import java.util.Scanner;

// Exercise 1
// Sur un plateau de 5 cases, proposez à l'utilisateur de bouger
// un pion à gauche ou à droite jusqu'à ce qu'il veuille quitter.

public class JeuTableau {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            char[] tableau = {'_', '_', '_', '_', '_'};
            int position = 2;
            tableau[position] = '*';

            while(true) {
                System.out.println(tableau);
                System.out.println("Déplacer le pion: gauche (g), droite (d), quitter (q)");
                char choixUtilisateur = sc.next().charAt(0);

                if (choixUtilisateur == 'g'){
                    if (position > 0){
                        tableau[position] = '_';
                        position --;
                        tableau[position] = '*';
                    }
                    else if (position == 0){
                        tableau[position] = '_';
                        position = 4;
                        tableau[position] = '*';
                    }
                }
                else if (choixUtilisateur == 'd'){
                    if (position < 4){
                        tableau[position] = '_';
                        position ++;
                        tableau[position] = '*';
                    }
                    else if (position == 4){
                        tableau[position] = '_';
                        position = 0;
                        tableau[position] = '*';
                    }
                }
                else if (choixUtilisateur == 'q'){
                    break;
                }
            }

        }
    }

