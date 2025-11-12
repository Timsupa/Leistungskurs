package blatt11;

import java.util.Arrays;

import static blatt07.ArbeitMitArrays.istSortiert;
public class BubbleSort {
    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1;i++) {
            for (int j = 0; j < arr.length - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,4,7,9,10};
        bubbleSort(arr);
        System.out.println(istSortiert(arr,true));
        //c bestacase arr.lenght, worstcase n^2 durchschnitt n
        //d) man könnte dies so tun jedoch würde es mehr operationen benötigen wenn es ein kurzer array ist als wenn man den  bubblesort einfach durchlaufen lässt
    }

}
