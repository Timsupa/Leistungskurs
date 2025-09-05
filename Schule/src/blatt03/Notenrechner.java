package blatt03;
import java.util.Scanner;
public class Notenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner an machen und definieren
        System.out.println("Was für eine Punktzahl war maximal erreichbar?");//nachfrage der max. Punktzahl und der ereichten Menge um die prozente auszurechnen
        double maxPunktzahl = input.nextDouble();
        System.out.println("Was für eine Punktzahl wurde erreicht?");
        double punktzahl = input.nextDouble();
        if (punktzahl > maxPunktzahl) {
            System.out.println("Sie haben ihr Dokument gefälscht!");
            System.exit(0);
        }else if (punktzahl < 0 || maxPunktzahl < 0) {
            System.out.println("Haben Sie sich vertippt? ");
            System.exit(0);
        }
        double prozent = punktzahl / maxPunktzahl * 100;//ausrechenen des prozentanteils
        if (punktzahl == maxPunktzahl) { //wenn die punktzahl amximal ist kommt die nachricht
            System.out.println("Herrzlichen Glükwunsch sie haben die volle Punktzahl erreicht!");
        }else if (prozent < 17) {//wennweniger als 17% wird die nachrricht ausgegeben
            System.out.println("Sie haben eine 6");
        }else if (prozent >= 17 && prozent < 39) {//wenn der % zwischen den beiden Zahlen ist wird der text ausgegeben
            System.out.println("Sie haben eine 5");
        }else if (prozent >= 39 && prozent < 55) {
            System.out.println("Sie haben eine 4");
        }else if (prozent >= 55 && prozent < 70) {
            System.out.println("Sie haben eine 3");
        }else if (prozent >= 70 && prozent < 85) {
            System.out.println("Sie haben eine 2");
        }else if (prozent >= 85 && prozent != 100) {//Wenn der % über 85 ist wird die Nachrricht ausgegeben außer sie ist 100
            System.out.println("Sie haben eine 1");
        }




    }
}
