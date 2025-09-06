package blatt03;
import java.util.Scanner;
public class PQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Was ist Ihr p Wert");//Abfrage der Werte
        double p = input.nextDouble();
        System.out.println("Was ist Ihr q Wert");
        double q = input.nextDouble();
        if (p < q) {//wenn p größer als q ist kommt es zu einer -Wurzel was nicht geht
            System.out.println("Diese Rechnung ist nicht machbar. Die Gleichung hat keine Reele Lösung. '\nWiederholen sie den Vorgang mit anderen Zahlen");
            System.exit(0);
        }
        double loesung1 = -(p/2) + Math.sqrt(p/2*(p/2)-q);//pq fromel ausrechnen für beide lösungen
        double loesung2 = -(p/2) - Math.sqrt(p/2*(p/2)-q);
        if (loesung1 == loesung2) {//wenn bei beiden das selbe rauskommt gibt es nur eine lösung
            System.out.println("Es gibt nur eine Lösung ,diese lautet");
            System.out.printf("%.2f", loesung1);
        }else {
            System.out.println("Ihr Gleichung hat 2 Lösungen");
            System.out.printf("Die erste Lösung beträgt " + "%.2f", loesung1);//nur zwei Nachkommastellen werden ausgegeben
            System.out.println('\n');
            System.out.printf("Die zweite Lösung beträgt " + "%.2f", loesung2);
        }
    }
}
