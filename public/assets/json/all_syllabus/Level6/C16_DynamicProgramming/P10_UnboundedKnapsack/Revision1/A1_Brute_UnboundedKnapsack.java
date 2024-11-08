package Level6.C16_DynamicProgramming.P10_UnboundedKnapsack.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Unbounded knapsack
 */
public class A1_Brute_UnboundedKnapsack {

    // Solution : Brute Approach - Unbounded knapsack
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Unbounded knapsack - Brute Approach : " + Arrays.toString(arr));
    }
}