package blatt03;
import java.util.Scanner;
public class SpringImKreis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Was für einen Radius soll der Kreis haben?");
        double radius = input.nextDouble();
        System.out.println("Nennen Sie erst eine X und dann eine Y Koordinate");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double rechnung = x*x + y*y;
        if (rechnung == 1) {
            System.out.println("Der Punkt ist auf dem Einheitskreis");
        }
        if (Math.sqrt(rechnung) <= radius) {
            System.out.println("Der Punkt ist im Kreis");
        }else{
            System.out.println("Der Punkt ist nicht im Kreis");
        }//TODO:aufgabe c

    }
}
