package blatt12;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int wert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > wert) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = wert;
        }
        return arr;
    }
    /*public static int[] insertionSortInPlace(int[] arr){
        for(int j = 0; j < arr.length; j++) {
            int l = arr[j];
            int obi = j-1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    hochpunkt = arr[i];
                    arr[i] = 0;
                }
            }
            neu[j] = hochpunkt;
        }
        return neu;
    }*/

    public static void main(String[] args) {
        blatt07.ArbeitMitArrays.printArray(insertionSort(new int[]{1,2,12,4,53,6,7,8,9,10}));
    }
}
