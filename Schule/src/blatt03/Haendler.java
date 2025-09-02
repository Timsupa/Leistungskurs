package blatt03;
import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double normale_SD_Preis = 5;
        double miniSD_Preis = 8;
        double microSD_Preis = 12;
        System.out.println("wie viele normaleSD wollen sie ");
        int menge_normalSD_Karte = input.nextInt();
        if (menge_normalSD_Karte < 0) {
            System.out.println("es sind keine negativen Zahlen erlaubt");
            System.exit(0);
        }
        if (menge_normalSD_Karte > 50) {
            System.out.println("die erlaubte Höhstmenge wurd überschritten. Menge wurde auf 50 gesetzt");
            menge_normalSD_Karte = 50;
            System.out.println("wie viele miniSD wollen sie ");
        }
        int menge_MiniSD_Karte = input.nextInt();
        if (menge_MiniSD_Karte < 0) {
            System.out.println("es sind keine negativen Zahlen erlaubt");
            System.exit(0);
        }
        if (menge_MiniSD_Karte > 50) {
            System.out.println("die erlaubte Höhstmenge wurd überschritten. Menge wurde auf 50 gesetzt");
            menge_MiniSD_Karte = 50;
            System.out.println("wie viele microSD wollen sie ");}
        System.out.println("wie viele MicroSD wollen sie");
        int menge_MicroSD_Karte = input.nextInt();
        if (menge_MicroSD_Karte < 0) {
            System.out.println("es sind keine negativen Zahlen erlaubt");
            System.exit(0);
            }
        if (menge_MicroSD_Karte > 50) {
            System.out.println("die erlaubte Höhstmenge wurd überschritten. Menge wurde auf 50 gesetzt");
            menge_MicroSD_Karte = 50;
            }
        double gesamtwert = normale_SD_Preis * menge_normalSD_Karte + microSD_Preis * menge_MicroSD_Karte + miniSD_Preis * menge_MiniSD_Karte;
        int gesamtmenge = menge_MicroSD_Karte + menge_MiniSD_Karte + menge_normalSD_Karte;
        if (gesamtmenge > 15) {
            double rabatPreis = gesamtwert * 0.15;
            double neuerPreis = gesamtwert -rabatPreis;
            System.out.println("Der Preis für . . .");
            System.out.println(menge_normalSD_Karte + " normale SD-Karten");
            System.out.println(menge_MiniSD_Karte + " mini SD-Karten");
            System.out.println(menge_MicroSD_Karte + " microSD-Karten");
            System.out.println(". . . lautet " + gesamtwert + "€");
            System.out.println("Sie kriegen 15% Mengenrabatt");
            System.out.println("Das entspricht "+ rabatPreis + "€");
            System.out.println("Ihr neuer Preis ist " + neuerPreis +"€");
        }else { System.out.println("Der Preis für . . .");
            System.out.println(menge_normalSD_Karte + " normale SD-Karten");
            System.out.println(menge_MiniSD_Karte + " mini SD-Karten");
            System.out.println(menge_MicroSD_Karte + " microSD-Karten");
            System.out.println(". . . lautet " + gesamtwert + "€");}


        }

    }
