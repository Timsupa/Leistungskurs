package blatt09;

import static blatt09.Teiler.istTeiler;
public class Kuerzen {
    public static boolean istKuerzbar(int nenner, int zähler){
        boolean h =false;
        for (int i = 1; i <= nenner+zähler; i++) {
            if (istTeiler(nenner, i) == true && istTeiler(zähler, i) == true) {
                h = true;
            }else {
                h = false;
            }
        }
        return h;
    }
    public static void kuerzen(int nenner,int zähler){
        while(true){
            if (istKuerzbar(nenner,zähler) == true){
                nenner /= 2;
                zähler /= 2;
            }else {
                break;
            }
        }
        System.out.println("Nenner "+nenner);
        System.out.println("Zähler "+zähler);
    }
}
