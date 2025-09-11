package blatt04;
import java.util.Scanner;
public class Potenzierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Basis an");//abfrage basis
        int Basis = input.nextInt();
        System.out.println("Bitte geben Sie den Exponenten an");//abfrage exponent
        int Exponent = input.nextInt();
        int nBasis = Basis;
        int mBasis = 0;
        if (Exponent > 0) {//wenn der exponent positiv ist wird normal die basis so oft mit sich selbst multipliziert bis der exponent durch Exponent --; auf 1 ist
            while (Exponent != 1) {
                mBasis = nBasis * Basis;
                Exponent--;
                nBasis = mBasis;
            }
            System.out.println("Das Ergebnis ist: " + mBasis);//Das Ergebnis mBasis wird ausgegeben
        } else if (Exponent < 0) {//beim negativen expo wird das selbe wie oben gemacht nur das am ende (auserhalb der while schleife) außer, dass 1 durch das "Ergebniss" geteilt wird um damit aus^n  ^-n
            while (Exponent != -1) {
                mBasis = nBasis * Basis;
                Exponent++;
                nBasis = mBasis;
            }
            mBasis = 1/ mBasis;
            System.out.println("Das Ergebnis ist: " + mBasis);
        } else if (Exponent == 0) {//wenn der exponent 0 ist wird das Ergebniss auf 1 gesetzt
            mBasis = 1;
            System.out.println("Das Ergebnis ist: " + mBasis);
        }
    }
}
