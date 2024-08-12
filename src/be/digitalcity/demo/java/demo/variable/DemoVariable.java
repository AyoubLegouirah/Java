package be.digitalcity.demo.java.demo.variable;

public class DemoVariable {
    public static void main(String[] args) {

        // ceci est un commentaire

        /*
        en
        plusieurs
        lignes
         */

        // Declaration en initialisation des variables
        String nom = "Kimtsaris", prenom = "Alexandre";


        // Type primitifs - les seuls qui ne contiennent pas de réf; à des objets

        // Nombre entiers
        byte tresPetitEntier = 127; // 1 octets => max : 127, min : -126
        short petitEntier = 32_767; // 2 octets => max : 32767, min: -32767
        int entier = 2_000_000_000; // 4 octets => max : 2 milliards, min : -2 milliards
        long grandEntier = 5_000_000_000L; // 8 octets => max : enormement, min : -enormement

        entier = 0b11111111; //ecriture binaire => 255
        entier = 0377; // ecriture octale => 255
        entier = 0xFF; // ecriture hexadecimal => 255


        // Nombre réels
        float reel = 0.5F; // 4 octets
        double reelPrecis = 0.9; // 8 octets

        // Autres
        boolean bool = false; // ou true // -1bit
        char caractere = 'a'; // 2 octets
        caractere = 97; // Les caracteres sont en réalité stockés en tant que nombres

        // Constante:
        final int TAUX_TVA = 21;


        // Convertions :

        entier = Integer.MAX_VALUE;
        // 01111111 11111111 11111111 11111111
        petitEntier = (short) entier; // Type Casting Explicite (necessaire car perte de donées)
        //                   11111111 11111111
        entier = petitEntier; // Type Casting Implicite
        // 00000000 00000000 11111111 11111111

        System.out.println(entier);

        entier = (int) reelPrecis;
        reelPrecis = entier;

        // Pour transformer de short en char, explicite necessaire
        caractere = (char) petitEntier;

        String nombre = "salut";

        // double converti = (double) nombre;

    }
}
