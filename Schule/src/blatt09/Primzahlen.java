package blatt09;
import java.util.Arrays;

import static blatt09.Teiler.istTeiler;
import static blatt09.Teiler.teiler;

public class Primzahlen {
    public static boolean istPrim(int n) {
        if (n == 1) return false;
        boolean h = true;
        for (int i = 2; n > i; i++) {
                if (istTeiler(n, i) == true) {
                    h = false;
                    break;
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
        int i= 1;
        while (true) {
            if (istPrim(i)){
                teiler[temp] = i;
                temp++;
                } else if (temp == n) {
                break;
            }
            i++;
        }
        return teiler;
    }

    public static void primfaktorzerlegung(int n) {
        System.out.print(n + " = ");
        while (!istPrim(n)) {
            int[] arr = Teiler.teiler(n);
            for (int i = 0; i < arr.length; i++) {
                if (istPrim(arr[i])) {
                    System.out.print(arr[i] + " * ");
                    n = n / arr[i];
                    break;
                }
            }
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        primfaktorzerlegung(124);
        System.out.println();
        istPrim(124);
    }
}
