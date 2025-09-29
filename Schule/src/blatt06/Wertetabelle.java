package blatt06;
    import java.util.Scanner;
    public class Wertetabelle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bis zu welchem Grad soll das Polynom gehen?");
            int grad = input.nextInt();
            double[] koeff = new double[grad + 1];
            for (int i = 0; i <= grad; i++) {
                System.out.println("Was ist der Koeffizient für " + i + "?");
                koeff[i] = input.nextDouble();
            }
            System.out.println("Von wo bis wo soll die Wertetabelle ausgegeben werden?");
            int unten = input.nextInt();
            int oben = input.nextInt();
            if (oben < unten) {
                int temp = oben;
                oben = unten;
                unten = temp;
            }
            for (int x = unten; x <= oben; x++) {
                double ergebnis = 0;
                for (int i = 0; i <= grad; i++) {
                    ergebnis += koeff[i] * Math.pow(x, i);
                }
                System.out.println("f " + x + " = " + ergebnis);
            }
        }
    }


