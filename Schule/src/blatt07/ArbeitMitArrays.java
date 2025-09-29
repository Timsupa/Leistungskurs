package blatt07;

public class ArbeitMitArrays {
    /**
     * methode zum ausgeben von einem int array in klammerschreibweise
     * @param arr länge des arrays / gibt diesen aus
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }

    /**
     * methode zum ausgeben eines double in klammerschreibweise
     * @param arr double wert der ausgegeben wird
     */
    public static void printArray(double[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }

    /**
     * boolean wert wird durch methode ausgegeben
     * @param arr boolean wert
     */
    public static void printArray(boolean[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static void printArray(char[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static void printArray(String[] arr){
        System.out.println("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static void istSortiert(int a){
        if(){}
    }
    public static void main(String[] args) {

    }
}
