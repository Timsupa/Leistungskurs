package blatt06;

public class DasErsteArray {
    public static void main(String[] args) {
        int zahlen[] = new int[990];
        int wert;
        for (int i = 0; i < zahlen.length; i++) {
            wert = i + 10;
            zahlen[i] = wert;
        }
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i]+ "\n");
        }
        System.out.println();
        for (int i = 989; i > -1; i--) {
            System.out.print(zahlen[i] + "\n");
        }
    }
}
