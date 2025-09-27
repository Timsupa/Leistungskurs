package blatt06;

import java.util.Scanner;

public class Wertetabelle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x[] = new int[0];
        System.out.printf("Bis zu welchem Grad wollen Sie Ausgaben haben?");
        int grad = input.nextInt();
        double koeff[] = new double[grad + 1];
        for (int i = grad; i != -1 ; i--) {
            System.out.printf("Was ist ihr erster Koeffizient?");
            koeff[i] = input.nextDouble();
        }
        for (int i = grad; i != -1; i--) {
            System.out.printf("Was ist ihr erster X-Wert");

        }



    }
}
