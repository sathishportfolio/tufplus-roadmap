package Level2.C6_Recursion.P2_CheckIfThereExistsASubsequenceWithSumK.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Subsequence Pattern Problems
 * Problem: Check if there exists a subsequence with sum K
 */
public class A2_Better_CheckIfThereExistsASubsequenceWithSumK {

    // Solution : Better Approach - Check if there exists a subsequence with sum K
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if there exists a subsequence with sum K - Better Approach : " + Arrays.toString(arr));
    }
}
