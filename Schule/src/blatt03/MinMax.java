package blatt03;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nennen Sie drei ganze Zahl");
        int zahl1 = input.nextInt();
        int zahl2 = input.nextInt();
        int zahl3 = input.nextInt();
        if (zahl1 > zahl2 && zahl2 > zahl3) {
            System.out.println("größte Zahl = "+zahl1);
            System.out.println("mittlere Zahl = "+zahl2);
            System.out.println("kleinste Zahl = " + zahl3);
        } else if (zahl1 < zahl2 && zahl2 > zahl3) {
            System.out.println("gröte Zahl = "+zahl2);
            System.out.println("mittlere Zahl = "+zahl3);
            System.out.println("kleinste Zahl = "+zahl1);
        } else if (zahl1 > zahl2 && zahl2 < zahl3) {
            System.out.println("gröte Zahl = "+zahl1);
            System.out.println("mittlere Zahl = "+zahl3);
            System.out.println("kleinste Zahl = "+zahl2);
        } else if (zahl1 < zahl2 && zahl2 < zahl3) {
            System.out.println("gröte Zahl = "+zahl3);
            System.out.println("mittlere Zahl = "+zahl2);
            System.out.println("kleinste Zahl = "+zahl1);
        }


    }
}
