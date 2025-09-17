package blatt05;
import java.util.Scanner;
public class Passwort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie ihr neues Passwort ein um es auf Sicherheit zu Prüfen ( Min. 8 Zeichen Groß und Klein Buchstaben und Sonderzeichen verwenden!)");
        String passwort = input.nextLine();
        if (passwort.length() < 8)  {
            if (passwort.contains("")) {}

        }
    }
}
