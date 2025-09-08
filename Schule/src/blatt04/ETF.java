package blatt04;
import java.util.Scanner;
public class ETF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monat = 0;
        int betrag = 0;
        double anteil;
        double wert = 3578.89;
        while(monat <= 12){
            monat = monat + 1;//monat
            betrag = betrag + 50;//monatsbetrag
            anteil = betrag / wert;
            System.out.printf("Ihr Anteil beträgt", "%.2f", anteil , "%");
            System.out.println("Ihr Betrag ist " + betrag + "€");
        }
    }
}
