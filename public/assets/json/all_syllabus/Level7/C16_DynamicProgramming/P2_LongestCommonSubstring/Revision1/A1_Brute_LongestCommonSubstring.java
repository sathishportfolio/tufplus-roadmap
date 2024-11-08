package Level7.C16_DynamicProgramming.P2_LongestCommonSubstring.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Longest common substring
 */
public class A1_Brute_LongestCommonSubstring {

    // Solution : Brute Approach - Longest common substring
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest common substring - Brute Approach : " + Arrays.toString(arr));
    }
}
