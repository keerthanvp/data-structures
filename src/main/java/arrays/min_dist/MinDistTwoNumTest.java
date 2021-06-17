package arrays.min_dist;

/*
Find the minimum distance between two numbers
Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[].
The array might also contain duplicates. You may assume that both x and y are different and present in arr[].

Examples:

Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3
and 5 is 2.
Explanation:3 is at index 0 and 5 is at
index 2, so the distance is 2

Input:
arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3},
x = 3, y = 6
Output: Minimum distance between 3
and 6 is 4.
Explanation:3 is at index 0 and 6 is at
index 5, so the distance is 4

Time Complexity: O(n)
Space Complexity: O(1)
 */

public class MinDistTwoNumTest {

    private static void findMinimumDistance(int[] arr, int x, int y) {
        int min = Integer.MAX_VALUE;
        int p = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (p != -1 && arr[i] != arr[p])
                    min = Math.min(min, i - p);
                p = i;
            }
        }
        if (min != Integer.MAX_VALUE)
            System.out.println("Minimum Distance: "+min);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int x = 3, y = 6;
        findMinimumDistance(arr, x, y);
    }
}
