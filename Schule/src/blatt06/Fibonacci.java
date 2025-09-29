package blatt06;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Zahlen sollen ausgegeben werden?");
        int anzahl = input.nextInt();
        int fibo[] = new int[anzahl];
        fibo[0] = 0;
        fibo[1] = 1;
        System.out.println(fibo[0] + "\n" + fibo[1]);
        for (int i=2; i<anzahl; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.println(fibo[i]);
        }
        double q1 = fibo[anzahl-1];
        double q2 = fibo[anzahl-2];
        double quo = q1 / q2;//umso höher die angabe "anzahl" ist umso näher kommt der Quotient ungefähr der Zahl 1,618
        System.out.printf("%.4f\n Der Quotient: ", quo);
    }
}
