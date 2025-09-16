package blatt05;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Gebe zwei zahlen ein");
        int a = input.nextInt();
        int b = input.nextInt();
        int c;
        if (a == b) {
            System.out.println(a);
            System.exit(0);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                c = a;
                a = b;
                b = c;
            }
        }
        System.out.println(a);

    }
}
