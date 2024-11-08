package Level2.C6_Recursion.P2_CountAllSubsequencesWithSumK.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Subsequence Pattern Problems
 * Problem: Count all subsequences with sum K
 */
public class A3_Optimal_CountAllSubsequencesWithSumK {

    // Solution : Optimal Approach - Count all subsequences with sum K
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count all subsequences with sum K - Optimal Approach : " + Arrays.toString(arr));
    }
}
