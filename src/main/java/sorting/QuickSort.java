package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static void print(int [] arr){
        System.out.println("\nSorted Array");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {9,6,2,1,5,3,8,10,4};
        quicksort(arr,0,arr.length-1);
        print(arr);
    }
}
