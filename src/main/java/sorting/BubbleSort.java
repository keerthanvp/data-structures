package sorting;

import java.util.Arrays;

/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
if they are in wrong order.
 */

public class BubbleSort {

    private static void sort(int [] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }

    private static void print(int [] arr){
        System.out.println("\nSorted Array");
        Arrays.stream(arr).forEach(System.out::println);
    }



    public static void main(String[] args) {
        int[] arr  = {5,3,4,2,6,7,1};
        System.out.println("Original Array");
        Arrays.stream(arr).forEach(System.out::println);
        sort(arr);
    }
}
