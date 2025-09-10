package blatt04;
import java.util.Scanner;
public class Dart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int punkte = 501;
        int wurf;
        while (true) {
            System.out.println("Gebe deine Punktzahl ein (0-180");
            wurf = input.nextInt();
            punkte = punkte - wurf;
            if (punkte < 0) {
                System.out.println("Die Punktzahl ist negativ");
                punkte = punkte + wurf;
            }
            if (punkte == 0) {
                System.out.println("Sie haben gewonnen");
                break;
            }
            System.out.println("Sie haben " + punkte + " Punkte");
        }
    }
    }

