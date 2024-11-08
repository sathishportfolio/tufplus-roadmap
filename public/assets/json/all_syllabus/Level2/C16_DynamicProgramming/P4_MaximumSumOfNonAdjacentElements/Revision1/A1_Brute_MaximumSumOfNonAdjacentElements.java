package Level2.C16_DynamicProgramming.P4_MaximumSumOfNonAdjacentElements.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: 1D DP
 * Problem: Maximum sum of non adjacent elements
 */
public class A1_Brute_MaximumSumOfNonAdjacentElements {

    // Solution : Brute Approach - Maximum sum of non adjacent elements
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Maximum sum of non adjacent elements - Brute Approach : " + Arrays.toString(arr));
    }
}
