package arrays.rearrange_pos_neg_numbers;

import java.util.Arrays;

/*
Move all negative numbers to beginning and positive to end with constant extra space
An array contains both positive and negative numbers in random order.
Rearrange the array elements so that all negative numbers appear before all positive numbers.

Examples :
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5

Note: Order of elements is not important here.

 */

public class RearrangePositiveNegativeWithoutOrderTest {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rearrange(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (true) {
            while (arr[i] < 0 && i <= arr.length - 1)
                i++;
            while (arr[j] > 0 && j > 0)
                j--;

            if (i < j)
                swap(arr, i, j);
            else
                break;
        }
    }

    public static void print(int[] arr) {
        Arrays.stream(arr)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 4, 1, 3, -7, -5, 6, -8, -1};
        rearrange(arr);
        print(arr);
    }
}
