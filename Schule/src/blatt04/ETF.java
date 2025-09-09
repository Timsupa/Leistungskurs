package blatt04;
import java.util.Random;
import java.util.Scanner;
public class ETF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Jahre wollen sie Ihr Geld anlegen (max 5)");
        int angabe = sc.nextInt();
        if (angabe > 5) {
            System.out.println("Ihre jahresangabe entspricht nicht den Richtlinien starten sie den Vorgang von vorne");
            System.exit(0);
        }
        int monat = 0;
        System.out.println("Wie viel Geld wollen Sie Monatlich anlegen");
        double betrag = sc.nextDouble();
        System.out.println("Um wie viel  Euro sollen  Ihre Monatlichen anlagen Jährlich erhöht werden");
        double erhöht = sc.nextDouble();
        int jahr = 1;
        double anteil;
        double zinssatz;
        double zukommen = 0;
        double gesamt = 0;
        double wert = 3578.89;
        Random rand = new Random();
        while (jahr < angabe + 1) {
            while (monat < 12) {
                zinssatz = rand.nextDouble();
                if (zinssatz < 0.5) {
                    zinssatz *= 24;
                } else if (zinssatz > 0.5) {
                    zinssatz *= 12;
                }
                    monat = monat + 1;//monat;
                    gesamt = gesamt + betrag;
                    gesamt = gesamt * (1+ (zinssatz /100));
                    anteil = gesamt / wert;
                    System.out.println("Jahr: " + jahr);
                    System.out.println("Sie befinden sich im " + monat + ". Monat");
                    System.out.println("Monatlicher betrag: " + betrag + " €");
                    System.out.printf("Ihr Anteil beträgt %.4f", anteil);
                    System.out.println(" %");
                    System.out.printf("Ihr Gesamtbetrag ist %.2f", gesamt);
                    System.out.println(" €\n");
                }
                jahr++;
                monat = 0;
                betrag = betrag + erhöht;
            }
        }
    }
