public class Dridi_Arwa {
    public int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }
    public double calculerMoyenne(int[] tableau) {
        if (tableau == null || tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
        }
        int somme = calculerSomme(tableau); // Appel de la méthode calculerSomme
        return (double) somme / tableau.length;
    }

}
