package blatt02;
import java.util.Scanner;
public class AmiiboKostenRechner {
    public static void main(String[] args) {
            Scanner eingib = new Scanner(System.in);
            System.out.println("Wie viele Figuren wollen sie Kaufen ?");
            int anzahl = eingib.nextInt();
            int kosten = anzahl * 15;
            System.out.println("Ihr gesamt Betrag lautet "+kosten);

    }
}
