package be.digitalcity.demo.java.exo;

import java.util.Scanner;

// Maintenant on veut analyser la réponse et placer sous un tableau et ensuite renvoyer le tableau

public class NombresPremierCorrection {
        public static void main(String[] args) {

            long start = System.currentTimeMillis();

            Scanner sc = new Scanner(System.in);
            System.out.println("Combien de nombre premiers?");
            int nbrATrouver = sc.nextInt();
            int nbrTrouve = 0;
            int candidat = 2;
            int [] premiers = new int [nbrATrouver];


            while (nbrTrouve < nbrATrouver){
                // verifier si candidat est permier
                boolean estPremier = true;

                for (int i = 0; i< nbrTrouve; i++){
                    int diviseur = premiers[i];
                    if (candidat % diviseur == 0)
                        estPremier = false;
                }

                /*
                for (int i = 2;estPremier && i*i <= candidat; i++) {
                    if (candidat % i == 0) {
                        estPremier = false;
                    }
                }
                */


                if (estPremier ) {
                    premiers[nbrTrouve] = candidat;
                    nbrTrouve++;
                }

                candidat++;
            }

            long end = System.currentTimeMillis(); // 4s




            System.out.printf("Execution time: %dms\n", end-start);

        }

    }

