package Level7.C16_DynamicProgramming.P6_ShortestCommonSupersequence.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Shortest common supersequence
 */
public class A3_Optimal_ShortestCommonSupersequence {

    // Solution : Optimal Approach - Shortest common supersequence
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Shortest common supersequence - Optimal Approach : " + Arrays.toString(arr));
    }
}
