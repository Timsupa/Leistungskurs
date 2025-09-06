package blatt03;
import java.util.Scanner;
public class PQAllgemein {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nennen Sie den Wert von a");
        double a = input.nextDouble();
        System.out.println("Nennen Sie den Wert von b");
        double b = input.nextDouble();
        System.out.println("Nennen Sie den Wert von c");
        double c = input.nextDouble();
        System.out.println("Nennen Sie den Wert von d");
        double d = input.nextDouble();
        if (a < 1){//pq formel funktionieret nicht wenn kein x^2 vorhanden ist
            System.out.println("a besitz einen nicht berechenbaren Wert. Starten Sie von Vorne und tragen einen neuen Wert ein");
            System.exit(0);
        }
        if (b/a < c/a-(d/a)){// p darf nicht größer als q sein sonst gibt es keine lösung
            System.out.println("Diese Rechnung ist nicht machbar. Die Gleichung hat keine Reele Lösung. '\nWiederholen sie den Vorgang mit anderen Zahlen");
            System.exit(0);
        }
        double loesung1 = -((b/a)/2) +Math.sqrt((b/a)/2*((b/a)/2)-(c/a-(d/a)));//pq formel rechnen wärend  die Allgemeineformel umstellt wird
        double loesung2 = -((b/a)/2) -Math.sqrt((b/a)/2*((b/a)/2)-(c/a-(d/a)));
        if (loesung1 == loesung2){//lösungen gleich = eine lösung
            System.out.println("Ihre Gleichung hat nur eine Lösung. Diese lautet");
            System.out.printf("%.2f", loesung1);

        }else if (loesung2 != loesung1) {//fals sie verschieden sind gibt es 2 lösungen
            System.out.println("Ihre Gleichung hat Zwei Lösungen.");
            System.out.printf("%.2f\n", loesung1);
            System.out.printf("%.2f", loesung2);
        }
    }
}
