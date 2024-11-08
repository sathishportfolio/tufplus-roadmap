package Level7.C16_DynamicProgramming.P1_LongestCommonSubsequence.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Longest common subsequence
 */
public class A1_Brute_LongestCommonSubsequence {

    // Solution : Brute Approach - Longest common subsequence
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest common subsequence - Brute Approach : " + Arrays.toString(arr));
    }
}
