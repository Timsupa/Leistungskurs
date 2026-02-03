package blatt13;

public class Zufall {
    public static double zufall(int grenze ){
        double zu = 0;
        zu = Math.random()*(grenze);
        return zu;
    }
    public static int zufallGanz(int grenze ){
        double zu = Math.random()*(grenze);
        int ganz = (int)zu;
        return ganz;
    }
    public static double zufall(int grenze, int grenzeo ){
        double zu = Math.random()*(grenzeo-grenze)+grenze;
        return zu;
    }
    public static int zufallGanz(int grenze,int grenzeo ){
        double zu = Math.random()*(grenzeo-grenze)+grenze;
        int ganz = (int)zu;
        return ganz;
    }
    public static int[] zufallArray(int läng,int grenze,int grenzeO ){
        int[] arr = new int[läng];
        for ( int i = 0;i < läng;i++){
            arr[i] = zufallGanz(grenze,grenzeO);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(zufallGanz(9));
        System.out.println(zufall(91));
        System.out.println(zufall(4,7));
        System.out.println(zufallGanz(4,7));
       blatt07.ArbeitMitArrays.printArray(zufallArray(20,1,9));
    }
}
