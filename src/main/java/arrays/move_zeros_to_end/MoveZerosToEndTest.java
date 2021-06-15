package arrays.move_zeros_to_end;

import java.util.Arrays;

/*
Move all zeroes to end of array - Using single traversal
Given an array of n numbers. The problem is to move all the 0’s to the end of the array while maintaining
the order of the other elements. Only single traversal of the array is required.

Examples:

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6}
Output : 1 2 3 6 0 0 0

Input: arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}
Output: 1 9 8 4 2 7 6 9 0 0 0 0 0

Time Complexity: O(n)
Space Complexity: O(1)

 */

public class MoveZerosToEndTest {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void print(int[] arr) {
        Arrays.stream(arr)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,3,2,6,0,7,0,0,8,9,11};
        moveZerosToEnd(arr);
        print(arr);
    }
}
