package blatt09;
import static blatt09.Teiler.istTeiler;
public class Primzahlen {
    public static boolean istPrim(int n){
        boolean h =true;
        for (int i = 1; n == i; i++) {
            if (i != n &&  i != 1) {
                if (istTeiler(n, i) == true) {
                    h = false;
                    break;
                }
            }
        }
        return h;
    }
    public static void printPrim(int n){
        for (int i = 1; i <= n; i++) {
            if (istPrim(i)==true) {
                System.out.println(i);
            }
        }
    }
    public static int[] generierePrimzahlen(int n){
        int[] teiler = new int[n];
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (istPrim(i)==true){
                teiler[temp] = i;
                temp++;
            }
        }
        return teiler;
    }
    public static void primfaktorzerlegung(int n){

    }
}
