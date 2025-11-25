package blatt12;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
         int wert = 0;
        int j = 0;
        for(int i=1;i<arr.length-1;i++){
            wert = arr[i];
            j = i;
            while(j>0 && arr[j]> wert ){
                arr[j] = arr[j-1];
                j = j-1;
                arr[j]= wert;
            }
        }
        return arr;
    }
    public static int[] insertionSortInPlace(int[] arr){
        int[] neu = new int[arr.length];
        int hochpunkt = 0;
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    hochpunkt = arr[i];
                    arr[i] = 0;
                }
            }
            neu[j] = hochpunkt;
        }
        return neu;
    }
}
