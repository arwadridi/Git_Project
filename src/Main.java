//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
    ArithmitiqueMethods arithmitique = new ArithmitiqueMethods();
    /// Remplissage du tableau
    arithmitique.tab[0]=5;
    arithmitique.tab[1]=5;
    arithmitique.tab[2]=5;
    arithmitique.tab[3]=5;
    //Test des méthodes implementer
        System.out.println("--------------- Debut ---------------");
        System.out.println("1. Somme tableau :"+ arithmitique.somme_tableau());
        System.out.println("2. Moyennne taleau :" + arithmitique.moyenne_tableau());
        System.out.println("3. Factorielle du 8"+arithmitique.factorial(8));
        System.out.println("4. Pair ou non pour le nombre 1942 --------------> " + arithmitique.pair(1942));
        System.out.println("5. Premier ou non pour la nombre 1972 --------------> " + arithmitique.premier(1972));
        System.out.println("6. Inverser la chaine IntelliJ --------------> "+ arithmitique.inverser("IntelliJ"));
        System.out.println("--------------- Fin ---------------");
    }
}