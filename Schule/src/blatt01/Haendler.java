package blatt01;

public class Haendler {
    public static void main(String[] args) {
        double normale_SD_Preis = 5;
        double miniSD_Preis = 8;
        double microSD_Preis = 12;
        int menge_normalSD_Karte = 0;
        int menge_MiniSD_Karte = 4;
        int menge_MicroSD_Karte = 2;
        double gesamtwert = normale_SD_Preis * menge_normalSD_Karte + microSD_Preis * menge_MicroSD_Karte + miniSD_Preis * menge_MiniSD_Karte;
        System.out.println("Der Preis für . . .");
        System.out.println( menge_normalSD_Karte + " normale SD-Karten");
        System.out.println( menge_MiniSD_Karte + " mini SD-Karten");
        System.out.println (menge_MicroSD_Karte + " microSD-Karten");
        System.out.println(". . . lautet " + gesamtwert + "€");






    }
}
