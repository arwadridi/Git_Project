public class Abdelkader_Jerbi {

 // Methode Calcule Puissance
     public static int calculerPuissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    // calcule PGCD
    public static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int reste = a % b;
            a = b;
            b = reste;
        }
        return a;
    }
}
// Conflit avec la branche master