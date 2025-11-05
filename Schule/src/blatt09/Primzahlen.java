package blatt09;
import static blatt09.Teiler.istTeiler;
public class Primzahlen {
    public static boolean istPrim(int n) {
        boolean h = true;
        for (int i = 1; n == i; i++) {
            if (i != n && i != 1) {
                if (istTeiler(n, i) == true) {
                    h = false;
                    break;
                }
            }
        }
        return h;
    }

    public static void printPrim(int n) {
        for (int i = 1; i <= n; i++) {
            if (istPrim(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static int[] generierePrimzahlen(int n) {
        int[] teiler = new int[n];
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (istPrim(i) == true) {
                teiler[temp] = i;
                temp++;
            }
        }
        return teiler;
    }

    public static void primfaktorzerlegung(int n) {
            int tempo = n;
            int j = 0;
            int[] teil = generierePrimzahlen(n);
            int[] temp = new int[teil.length];
            for (int i = 1; i <= teil.length - 1; i++) {
                if (n % teil[i] == 0) {
                    temp[j] = teil[i];
                    if (temp[j] == 0) {
                        break;
                    }
                    j++;
                    n = n / teil[i];
                    i--;
                    if (n == 1 || n == 0) {
                        break;
                    }
                }
            }
            System.out.print(tempo + " = ");
            for (int i = 0; i <= temp.length; i++) {
                if (temp[i] == 0) {
                    break;
                }
                if (i != 0) {
                    System.out.print(" * ");
                }
            System.out.print(temp[i]);
        }
    }

    public static void main(String[] args) {
        primfaktorzerlegung(5184761);
    }
}
