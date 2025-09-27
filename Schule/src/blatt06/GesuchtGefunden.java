package blatt06;

public class GesuchtGefunden {
    public static void main(String[] args) {
        double[] arr = new double[]{3.45, 7, 14, -66, 5.4, 33.33, 99.1, 42.3, 3.14, -3.14, 13.56, 7.8031, -54.35, 6.120, 6.435, -2.30001, 0.00005, -65.78, -29.57, 92, -83, 3174.56, -1469.349, -5.086, 27.135, 348.5, 52.3568, -47.320051, 8372.579, -593.2, 0.25874, -7.1952, 3587.6, -201.3, -65.92, 12, 5, 13.7, -30, 16.5, 10071, 1700.34, -50.05, 81.3576, -42};
        double höchste = arr[0];
        double niedrigste = arr[0];
        double summe = 0;
        double paardiff = 10000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < niedrigste) {
                niedrigste = arr[i];
            }
            if (arr[i] > höchste){
                höchste = arr[i];
            }
            summe = summe + arr[i];
            }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < paardiff) {
                paardiff = arr[i + 1] - arr[i];
        }
        }
        System.out.println("Niedrigste Zahl = " + niedrigste);
        System.out.println("Höchste Zahl = " + höchste);
        System.out.println("Summe = " + summe);
        System.out.println("Die kleinste Paardifferenz = " + paardiff);
    }
}
