package blatt12;

public class SelectionSort {
    public static void selectionSort(int[] arr, String mm) {
        if (mm == "min") {
            int min = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        } else if (mm == "max") {
            int max = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                max = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[max]) {
                        max = j;
                    }
                    int temp = arr[j];
                    arr[j] = arr[max];
                    arr[max] = temp;
                }
            }
        }
        blatt07.ArbeitMitArrays.printArray(arr);
    }

    public static void main(String[] args) {
        selectionSort(new int[]{1,2,32,4,53,6,7,8,9,10}, "min");
    }
}
