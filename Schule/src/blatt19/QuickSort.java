package blatt19;

public class QuickSort {
    public static char[] trennenLinks(char[] liste,int pivot){
        int kleinerCount = 0;
        for (int i = 1; i < liste.length; i++) {
            if (liste[i] < pivot) {
                kleinerCount++;
            }
        }
        char[] kleiner = new char[kleinerCount+1];
        int kleine = 0;
        for (int i = 0; i < liste.length-1; i++) {
            if (i == pivot){
                continue;
            }
            if (liste[i] < liste[pivot]) {
                kleiner[kleine] = liste[i];
                kleine++;
            }
        }
        return kleiner;
    }
    public static char[] trennenRechts(char[] liste,int pivot){
        int g = 0;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] >= liste[pivot]) {
                g++;
            }
        }
        char[] groesser = new char[g];
        int gro= 0;
        for (int i = 0; i < liste.length; i++) {
            if (i == pivot){
                continue;
            }
            if (liste[i] >= liste[pivot]) {
                groesser[gro] = liste[i];
            }
        }
        return groesser;
    }
    public static char[] zusammenfuegen(char[] liste1,char[] liste2){
        char[] neue = new char[liste1.length+liste2.length];
        for (int i = 0; i < liste1.length; i++) {
            neue[i] = liste1[i];
            neue[i+liste1.length] = liste2[i];
        }
        return neue;
    }
    public static char[] quickSort(char[] liste){
        if (liste.length > 1) {
            int pivot = liste[0];
            char[] kSortiert = quickSort(trennenLinks(liste, pivot));
            char[] gSortiert = quickSort(trennenRechts(liste, pivot));
            return zusammenfuegen(kSortiert, gSortiert);
        } else if (liste.length <= 1) {
            return liste;
        }
        return liste;
    }

    public static void main(String[] args) {
        char[] bob = new char[]{2,65,25,74,21,673,35};
        quickSort(bob);
    }
}
