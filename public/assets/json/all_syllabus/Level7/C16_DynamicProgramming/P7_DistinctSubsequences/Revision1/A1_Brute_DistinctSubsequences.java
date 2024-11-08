package Level7.C16_DynamicProgramming.P7_DistinctSubsequences.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Distinct subsequences
 */
public class A1_Brute_DistinctSubsequences {

    // Solution : Brute Approach - Distinct subsequences
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Distinct subsequences - Brute Approach : " + Arrays.toString(arr));
    }
}