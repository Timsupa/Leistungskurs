package blatt02;
import java.util.Scanner;
public class Zinssatz {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Was ist ihr Kapital");
            double altesKapital = input.nextDouble();
            System.out.println("Was für ein Zinssastz kriegen Sie (Angaben in % ohne Prozentzeichen)");
            double zinssatz = input.nextDouble();
            double zinsen = altesKapital *  zinssatz / 100;
            double neuesKapital  =  altesKapital + zinsen;
            System.out.println("Alten Kapital: " + altesKapital +"€");
            System.out.println("Zinssatz: " + zinssatz + "%\n");
            System.out.println("Zinsen:" + zinsen + "€");
            System.out.println("Neues Kapital: " + neuesKapital + "€");};
            //TODO: % error beheben

            /* double zinssatz = input.nextDouble();
            double zinsen = altesKapital *  zinssatz / 100;
            double neuesKapital  =  altesKapital + zinsen;
            System.out.println("Alten Kapital: " + altesKapital +"€");
            System.out.println("Zinssatz: " + zinssatz + "%\n");
            System.out.println("Zinsen:" + zinsen + "€");
            System.out.println("Neues Kapital: " + neuesKapital + "€");*/











    }

