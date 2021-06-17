package arrays.sum_pair;

/*
Print number of sum pairs available where sum of pair of elements between A[] and B[] is available in A

 */

import java.util.HashSet;
import java.util.Set;

public class SumPairTest {

    private static void findNumberOfSumPair(int[] A, int[] B) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        System.out.println(set);
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < B.length - 1; j++) {
                int sum = A[i] + B[j];
                if (set.contains(sum)) {
                    count++;
                }
            }
        }
        System.out.println("Number of Sum Pairs: " + count);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {1, 2, 10};
        findNumberOfSumPair(A, B);
    }
}
