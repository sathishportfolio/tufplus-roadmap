package Level7.C16_DynamicProgramming.P3_LongestPalindromicSubsequence.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Longest palindromic subsequence
 */
public class A3_Optimal_LongestPalindromicSubsequence {

    // Solution : Optimal Approach - Longest palindromic subsequence
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest palindromic subsequence - Optimal Approach : " + Arrays.toString(arr));
    }
}
