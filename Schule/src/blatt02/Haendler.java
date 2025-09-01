package blatt02;
import java.util.Scanner;
public class Haendler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double normale_SD_Preis = 5;
        double miniSD_Preis = 8;
        double microSD_Preis = 12;
        System.out.println("wie viele normaleSD wollen sie ");
        int menge_normalSD_Karte = input.nextInt();
        System.out.println("wie viele miniSD wollen sie ");
        int menge_MiniSD_Karte = input.nextInt();
        System.out.println("wie viele microSD wollen sie ");
        int menge_MicroSD_Karte = input.nextInt();
        double gesamtwert = normale_SD_Preis * menge_normalSD_Karte + microSD_Preis * menge_MicroSD_Karte + miniSD_Preis * menge_MiniSD_Karte;
        System.out.println("Der Preis für . . .");
        System.out.println( menge_normalSD_Karte + " normale SD-Karten");
        System.out.println( menge_MiniSD_Karte + " mini SD-Karten");
        System.out.println (menge_MicroSD_Karte + " microSD-Karten");
        System.out.println(". . . lautet " + gesamtwert + "€");






    }
}
