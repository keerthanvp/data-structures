package arrays.minimum_ele;

/*
Find the minimum element in a sorted and rotated array
A sorted array is rotated at some unknown point, find the minimum element in it.
The following solution assumes that all elements are distinct.

Examples:

Input: {5, 6, 1, 2, 3, 4}
Output: 1

Input: {1, 2, 3, 4}
Output: 1

Input: {2, 1}
Output: 1

Time Complexity: O(nlogn)
Space Complexity: O(1)
 */

public class MinimumElementTest {

    public static int findMinimumEle(int[] arr, int l, int r) {

        int mid = (l + r)/2;
        if (arr[mid-1]>arr[mid] && arr[mid]<arr[mid+1])
            return arr[mid];
        if (arr[mid]>arr[mid+1])
            return findMinimumEle(arr,mid+1,r);
        else
            return findMinimumEle(arr,l,mid+1);

    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 3, 4, 5, 6, 7};
        System.out.println(findMinimumEle(arr,0, arr.length-1));
    }
}
