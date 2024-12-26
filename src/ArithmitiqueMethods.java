public class ArithmitiqueMethods {
    public int[] tab= new int[4];
    public int somme_tableau() {
       int s=0;
        for (int i = 0 ; i < tab.length ; i++){
          s+=tab[i];
        }
        return s;
    }
    public float moyenne_tableau() {
        int x = somme_tableau();
        return x / tab.length;
    }
    public int factorial(int n) {
        int s =0;
        for (int i = 1 ; i < n ; i++){
            s*=i;
        }
    return s;
    }
    public boolean pair(int n){
        return (n % 2 == 0) ? true : false ;
    }
    public boolean premier(int n ) {
        for (int i = 0 ; i < n%2 ; i ++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public String inverser(String s){
        String ch = "";
        for (int i = 0 ; i < s.length() ; i++){
            ch = s.charAt(i)+ch;
        }
        return ch;
    }
}
