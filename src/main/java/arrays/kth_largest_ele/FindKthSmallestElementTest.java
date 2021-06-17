package arrays.kth_largest_ele;

import java.util.Arrays;

/*
K’th Smallest/Largest Element in Unsorted Array
Given an array and a number k where k is smaller than the size of the array, we need to find the
k’th smallest element in the given array. It is given that all array elements are distinct.
 */

public class FindKthSmallestElementTest {

    public static void findKthSmallestElement(int[] arr, int k) {
        int [] sorted = Arrays.stream(arr).sorted().toArray();
        System.out.println("Kth smallest element: "+sorted[k-1]);
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        findKthSmallestElement(arr, k);
    }
}
