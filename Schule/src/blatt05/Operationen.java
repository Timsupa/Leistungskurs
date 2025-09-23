package blatt05;

public class Operationen {
    public static void main(String[] args) {
        int[] Wert = new int[]{9000, 23000, 41000, 6000, 13000, 22000, 38000, 16000, 7000, 14000, 12000, 5000, 17000};
        int summe = 0;
        int t =Wert[6];
        Wert[6] = Wert[1];
        Wert[1] = t;
        int a = Wert[0];
        int b = Wert[1];
        int c = Wert[2];
        int d = Wert[3];
        int e = Wert[4];
        int f = Wert[5];
        int g = Wert[6];
        int h = Wert[7];
        int p = Wert[8];
        int j = Wert[9];
        int k = Wert[10];
        int l = Wert[11];
        int m = Wert[12];
        Wert[0] = Wert[1];
        Wert[1] = Wert[2];
        Wert[2] = Wert[3];
        Wert[3] = Wert[4];
        Wert[4] = Wert[5];
        Wert[5] = Wert[6];
        Wert[6] = Wert[7];
        Wert[7] = Wert[8];
        Wert[8] = Wert[9];
        Wert[9] = Wert[10];
        Wert[10] = Wert[11];
        Wert[11] = Wert[12];
        Wert[12] = Wert[0];
        for(int i = 0; i < Wert.length; i++){
            summe += Wert[i];
            if (Wert[i] > 15000){
                System.out.printf("Wert = %d\n", Wert[i]);
            }
        }
        System.out.printf("Summe: %d\n", summe);


    }
}
