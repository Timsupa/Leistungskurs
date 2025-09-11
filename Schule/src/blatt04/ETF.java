package blatt04;
import java.util.Random;
import java.util.Scanner;
public class ETF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Jahre wollen sie Ihr Geld anlegen (max 5)");//abfrage wie lange die while schleife gehen soll
        int angabe = sc.nextInt();
        if (angabe > 5) {
            System.out.println("Ihre jahresangabe entspricht nicht den Richtlinien starten sie den Vorgang von vorne");
            System.exit(0);
        }
        int monat = 0;
        System.out.println("Wie viel Geld wollen Sie Monatlich anlegen");//def vom betrga
        double betrag = sc.nextDouble();
        System.out.println("Um wie viel  Euro sollen  Ihre Monatlichen anlagen Jährlich erhöht werden");//nach jedem jahr wird die hier eingegebene zahl auf den betrag addiert
        double erhöht = sc.nextDouble();
        int jahr = 1;
        double anteil;//variablen werden vor der schleife defieniert sonst kommt ein error
        double zinssatz;
        double zukommen = 0;
        double gesamt = 0;
        double wert = 3578.89;//wert des etf damit man den anteil ausrechnen kann
        Random rand = new Random();
        while (jahr < angabe + 1) {
            while (monat < 12) {
                zinssatz = rand.nextDouble();
                if (zinssatz < 0.5) {
                    zinssatz = zinssatz * 24 /100 +1;//double zahl wird in 1,xx geschellt damit es wie prozente mit dem "gesamt"multipliziert wertden kann
                } else if (zinssatz > 0.5) {
                    zinssatz = zinssatz * 12 /100 +1;
                }
                    monat = monat + 1;//monat;
                    gesamt = gesamt + betrag;//gesamt wird mit monatlichem betrag addiert
                    gesamt = gesamt * zinssatz;//zinsen werden auf das konto gerechnet
                    anteil = gesamt / wert;
                    System.out.println("Jahr: " + jahr);// ausgabe aller nutzvollen varieabeln
                    System.out.println("Sie befinden sich im " + monat + ". Monat");
                    System.out.println("Monatlicher betrag: " + betrag + " €");
                    System.out.printf("Ihr Anteil beträgt %.4f", anteil);
                    System.out.println(" %");
                    System.out.printf("Ihr Gesamtbetrag ist %.2f", gesamt);// mit print f nachkommastellen begrenzt
                    System.out.println(" €\n");
                }
                jahr++;//jahr wird addiert damit die schleife nicht undendlich ist
                monat = 0;// monat wird zurückgestez sobald die while schleife endet damit beim neuen jahr monat wieder 0 ist
                betrag = betrag + erhöht;
            }
        }
    }
