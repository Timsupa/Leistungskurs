package blatt04;
import java.util.Scanner;
public class Rechenuebung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Multiplikator ein: ");
        double multiplikator = input.nextDouble();
        System.out.println("Bitte geben Sie den Multiplikand ein: ");
        double multiplikand = input.nextDouble();
        double antwort = 0;
        while (antwort != multiplikand * multiplikator){
            System.out.println("Geben Sie Die Antwort von " + multiplikator + " * " + multiplikand + " ein:");
            antwort = input.nextDouble();
        }
        System.out.println("Gut! Die Lösung ist " + multiplikand * multiplikator);
    }
}
