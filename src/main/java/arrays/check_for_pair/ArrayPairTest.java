package arrays.check_for_pair;

/*
PROBLEM STATEMENT
Given an array A[] and a number x, check for pair in A[] with sum as x

Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.

Time Complexity : O(n)
 */

import java.util.HashSet;
import java.util.Set;

public class ArrayPairTest {

    public static void findPair(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(sum-arr[i])){
                System.out.println("Pair: "+(sum-arr[i])+" and "+arr[i]);
                return;
            }
            set.add(arr[i]);
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int sum = -2;
        findPair(arr,sum);
    }
}
