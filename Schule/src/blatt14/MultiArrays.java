package blatt14;

public class MultiArrays {
    public static void print2DArray(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void print2DArray(double[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void print2DArray(char[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] create2DArray(int a, int b, int p, int q) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = blatt13.Zufall.zufallGanz(p,q);
            }
        }
        return arr;
    }
    public static double[][] create2DDoubleArray(int a, int b) {
        double[][] arr = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = Math.random();
            }
        }
        return arr;
    }
    public static int[][] createCountingArray(int a, int b) {
        int h = 0;
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = h;
                h++;
            }
        }
        return arr;
    }
    public static char[][] createEmpty2DCharArray(int a, int b) {
        char[][] arr = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = ' ';
            }
        }
        return arr;
    }
    public static boolean istIdentisch(char[][] arr, char[][] arr2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] shiftRows(int[][] arr, int reihe ,int wert) {
       int[][] newArr = arr.clone();
       int[] j = arr[reihe].clone();
           for (int l = 0;l < wert;l++) {
              j = blatt07.ArbeitMitArrays.shiftLeft(j);
           }
       newArr[reihe] = j;
       return newArr;
    }
    public static char[][] copy2DCharArray(char[][] arr) {
        char[][] newArr = arr.clone();
        return newArr;
    }


    public static void main(String[] args) {
        int [][] g = create2DArray(17,6,1,4);
        print2DArray(g);
        System.out.println();
        print2DArray(shiftRows(g,0,1));
        //1 2 2 1 3
    }

}
