public class GharbiOumayma {

    
    public static int factoriel(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) resultat *= i;
        return resultat;
    }

    // Méthode pour calculer la puissance
    public static int puissance(int a, int b) {
        int resultat = 1;
        for (int i = 0; i < b; i++) resultat *= a;
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println("Factoriel de 5 : " + factoriel(5));
        System.out.println("2 puissance 3 : " + puissance(2, 3));
    }
}
