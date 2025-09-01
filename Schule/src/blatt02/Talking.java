package blatt02;
import java.util.Scanner;

public class Talking {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);//scanner wird als varieable input defieniert und"an" gemacht
            System.out.println("Wie heißt du?");//frage
            String name = input.nextLine();//die antwort (buchstaben) wird in der varieable gespeichert
            System.out.println("Hallo " + name);//ausgabe der varieable
    }
}
