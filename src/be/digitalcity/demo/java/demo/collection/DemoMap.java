package be.digitalcity.demo.java.demo.collection;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // La map n'est pas vraiment une collection
        // Elle est ordonée via une clé
        HashMap<String, int[]> notesParClasse = new HashMap<>();

        // Ajouter ou Remplacer
        notesParClasse.put( "A1", new int[]{1,2,3} );
        if( notesParClasse.containsKey("C4") ){
            // remplacement
            notesParClasse.put( "C4", new int[]{20} );
        }
        else {
            // ajouter
            notesParClasse.put( "C4", new int[]{10,2,0,5} );
        }

        // Récuperer

        String clef = "A1";
        int[] valeur = notesParClasse.get(clef);

        Collection<int[]> valeurs = notesParClasse.values();
        Set<String> clefs = notesParClasse.keySet();
        Set<Map.Entry<java.lang.String, int[]>> entrySet = notesParClasse.entrySet();






    }
}
