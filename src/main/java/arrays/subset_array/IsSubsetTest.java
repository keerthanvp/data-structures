package arrays.subset_array;

/*
Check if the given array is a subset of the other array

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
Output: arr2[] is not a subset of arr1[]

Time Complexity : O(m+n)
 */

import java.util.HashSet;
import java.util.Set;

public class IsSubsetTest {

    public static boolean isSubset(int [] arr1, int [] arr2){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++)
            set.add(arr1[i]);

        for (int i = 0; i < arr2.length; i++) {
            if (!set.contains(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {2,5,9};
        int [] arr3 = {2,5,11};
        int [] arr4 = {1,6,8,3};
        System.out.println("isSubset: "+ isSubset(arr1,arr2));
        System.out.println("isSubset: "+ isSubset(arr1,arr3));
        System.out.println("isSubset: "+ isSubset(arr1,arr4));
    }
}
