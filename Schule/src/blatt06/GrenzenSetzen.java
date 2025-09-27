package blatt06;
import java.util.Scanner;
public class GrenzenSetzen {
    public static void main(String[] args) {
        System.out.println("Was soll die Untergrenze sein?");
        Scanner input = new Scanner(System.in);
        int untergrenze = input.nextInt();
        System.out.println("Was soll die Obergrenze sein?");
        int obergrenze = input.nextInt();
        if (untergrenze > obergrenze) {
            System.out.println("Sie haben einen Fehler begangen ,starten Sie von Vorne");
            System.exit(0);
        }
        System.out.println("Ihr Array beinhaltet: ");
        int zahlen[] = new int[obergrenze - untergrenze + 1];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = untergrenze;
            untergrenze++;
            System.out.println(zahlen[i]);
        }

    }
}
