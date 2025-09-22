package blatt05;
import  java.util.Scanner;
public class NotenlisteMitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] noten = new int[10];
        for(int a = 0; a < noten.length; a++ ){
            System.out.println("Geben Sie die Note ein");
            noten[a] = input.nextInt();
        }
        for (int i = 0; i <= noten.length - 1; i++) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
        }
    }
}


