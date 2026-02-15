package blatt13;

public class Risiko {
    static int Angeifer1;
    static int Angreifer2;
    static int Angreifer3;
    static int Verteigier1;
    static int Verteigier2;
    public static void main(String[] args) {
        int verlustAng = 0;
        int verlustVer = 0;
        Angeifer1 =blatt13.Zufall.zufallGanz(1, 6);
        Angreifer2 =blatt13.Zufall.zufallGanz(1, 6);
        Angreifer3 =blatt13.Zufall.zufallGanz(1, 6);
        Verteigier1 =blatt13.Zufall.zufallGanz(1, 6);
        Verteigier2 =blatt13.Zufall.zufallGanz(1, 6);
        int[] ang = new int[] {Angeifer1,Angreifer2,Angreifer3};
        int[] ver = new int[] {Verteigier1,Verteigier2};
        blatt12.SelectionSort.selectionSort(ver,"max");
        blatt12.SelectionSort.selectionSort(ang,"max");
        for (int x = 0; x < 2; x++) {
            if (ver[x] > ang[x]) {//keine angabe wqas bei gleicher zahl passiert
                verlustAng++;
            }else {
                verlustVer++;
            }
        }
        System.out.println();
        System.out.println(verlustVer);
        System.out.println(verlustAng);
    }

}
