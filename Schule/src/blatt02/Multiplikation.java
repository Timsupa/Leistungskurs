package blatt02;
import java.util.Scanner;
public class Multiplikation {
    public static  void main(String[] args) {
            Scanner einga = new Scanner(System.in);
            System.out.println("Nenne die erste (ganze) Zahl");
            int erste = einga.nextInt();
            System.out.println("Nenne die zweite (ganze) Zahl");
            Integer zweite = einga.nextInt();
            int ergebniss = erste * zweite;
        System.out.println(erste  + " * " + zweite + " = " + ergebniss);


    }
}
