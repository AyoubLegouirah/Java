package be.digitalcity.demo.java.exo;

import java.util.Random;
import java.util.Scanner;

// BONUS 1:
// Plateau de 10 cases
// Placez sur le plateau 3 pièces à des positions aléatoire.
// Le jeu se termine quand toutes les pièces sont récupérée


public class JeuTableauBonus1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] tableau = {'_', '_', '_', '_', '_','_', '_', '_', '_', '_'};


        Random random = new Random();
        int position = random.nextInt(tableau.length);
        tableau[position] = '*';

        Random randomPiece = new Random();
        int piece = randomPiece.nextInt(tableau.length);
        tableau[piece] = '$';

        for (piece = 1; piece < 3; piece++) {
            int piecePosition = randomPiece.nextInt(tableau.length);
            while (tableau[piecePosition] != '_') {
                piecePosition = randomPiece.nextInt(tableau.length);
            }
            tableau[piecePosition] = '$';
        }

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
                    position = 9;
                    tableau[position] = '*';
                }
                else if (position == 0){
                    tableau[piece] = '$';
                    position = 9;
                    tableau[position] = '*';
                }
            }
            else if (choixUtilisateur == 'd'){
                if (position < 9){
                    tableau[position] = '_';
                    position ++;
                    tableau[position] = '*';
                }
                else if (position == 9){
                    tableau[position] = '_';
                    position = 0;
                    tableau[position] = '*';
                }
                else if (position == 0){
                    tableau[piece] = '$';
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
