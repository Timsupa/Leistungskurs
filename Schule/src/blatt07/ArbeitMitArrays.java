package blatt07;

public class ArbeitMitArrays {
    /**
     * methode zum ausgeben von einem int array in klammerschreibweise
     * @param arr länge des arrays / gibt diesen aus
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
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
        for(int i = 0;i < arr.length;i++){
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
        for(int i = 0;i < arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static void printArray(char[] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static void printArray(String[] arr){
        System.out.println("[");
        for(int i = 0;i < arr.length;i++){
            System.out.print("|" + arr[i]);
        }
        System.out.print("]");
    }
    public static boolean istSortiert(int[] arr,boolean b){
        for(int j = 0; j< arr.length-1; j++){
             if (arr[j]< arr[j+1]){
                return b = true;
             }else {
               return b =  false;
             }
        }
        return b;
    }
    public static int[] addieren(int[] a, int[] b){
        int[] d = new int[a.length + b.length];
        if(a.length > b.length){
            int i = 0;
            int c = b.length;
            d =new int[a.length];
            while (c != 0){
                    d[i] += a[i] + b[i];
                    i++;
                    c--;
                }
            while (a.length != c + b.length){
                d[i] = a[i];
                i++;
                c++;
            }

            }else if (a.length < b.length){
                int i = 0;
                int c = a.length;
                 d =new int[b.length];
                while (c != 0){
                    d[i] = a[i] + b[i];
                    i++;
                    c--;
                }
                while (b.length != c + a.length){
                    d[i] = b[i];
                    i++;
                    c++;
                }
            } else if (b.length== a.length){
            int i = 0;
            int c = a.length;
            d =new int[b.length];
            while (c != 0){
                d[i] = a[i] + b[i];
                i++;
                c--;
            }
        }
        return d;
    }
    public static int[] shiftLeft(int[] arr){
        int a = arr[0];
        for(int j = 0; j < arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        arr[arr.length] = a;
        return arr;
    }
    public static int[] shiftRight(int[] arr){
        int a = arr[arr.length];
        for(int j = 0; j < arr.length-1; j++){
            arr[j+1] = arr[j];
        }
        arr[0] = a;
        return arr;
    }
    public static int[] shiftLeftAbsolute(int[] arr){
        int a = 0;
        for(int j = 0; j < arr.length-1; j++){
            arr[j] = arr[j + 1];
        }
        arr[arr.length] = a;
        return arr;
    }
    public static int[] shiftRightAbsolute(int[] arr){
        int a = 0;
        for(int j = 0; j < arr.length-1; j++){
            arr[j + 1] = arr[j];
        }
        arr[0] = a;
        return arr;
    }


    public static void main(String[] args) {

    }
}
