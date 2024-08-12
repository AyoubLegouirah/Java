package be.digitalcity.demo.java.oo.exo7;

import java.util.Random;

public class De {
   public static class SubClass {
       public static void lancéDé(int nbFaces, int resultat) {

           Random rdm = new Random();

           int i = rdm.nextInt(1, nbFaces);
           System.out.println("Le dé a lancé: " + i);

       }
   }

}



