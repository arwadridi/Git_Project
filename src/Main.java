//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Dridi_Arwa utils = new Dridi_Arwa();
        int[] tableaux = {1, 2, 3, 4, 5};
        int somme = utils.calculerSomme(tableaux);
        System.out.println("La somme du tableau est : " + somme);
        try {
            double moyenne = utils.calculerMoyenne(tableaux);
            System.out.println("La moyenne du tableau est : " + moyenne);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        FatmaBarrani f = new FatmaBarrani();
        f.nombrePaire(2);
        f.checkNombrePremier(5);

        }




    }
