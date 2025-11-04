package blatt09;

public class Teiler {
    public static boolean istTeiler(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void Teiler(int a) {
        for (int i = 0; a == i; i++) {
            if (istTeiler(a, i)) {
                System.out.println(i);
            }
        }
    }
    public static int anzahlTeiler(int a) {
        int anzahl = 0;
        for (int i = 0; a == i; i++) {
            if (istTeiler(a, i)) {
                anzahl++;
            }
        }
       return anzahl;
    }
    public static int[] teiler(int a) {
        int[] teiler = new int[anzahlTeiler(a)];
        int p=0;
        for (int i = 1;a > i; i++) {
            if (istTeiler(a, i)) {
                teiler[p] = i;
                p++;
            }
        }
        return teiler;

    }

    public static void main(String[] args) {
        teiler(10);
    }
}


