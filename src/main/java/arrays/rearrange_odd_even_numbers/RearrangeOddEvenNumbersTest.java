package arrays.rearrange_odd_even_numbers;

/*
Rearrange array such that even positioned are greater than odd
Given an array A of n elements, sort the array according to the following relations :

A[i] >= A[i-1], if i is even.
A[i] <= A[i-1], if i is odd.
Print the resultant array.

Examples :
Input : A[] = {1, 2, 2, 1}
Output :  1 2 1 2
Explanation :
For 1st element, 1  1, i = 2 is even.
3rd element, 1  1, i = 4 is even.

Input : A[] = {1, 3, 2}
Output : 1 3 2
Explanation :
Here, the array is also sorted as per the conditions.
1  1 and 2 < 3.
 */

import java.util.Arrays;

public class RearrangeOddEvenNumbersTest {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rearrange(int[] arr){
        int i = 0;
        while (i< arr.length){
            if (arr[i]>arr[i+1])
                swap(arr, i, i+1);
            i = i+2;
        }
    }

    public static void print(int[] arr) {
        Arrays.stream(arr)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,1,7,4};
        rearrange(arr);
        print(arr);
    }
}
