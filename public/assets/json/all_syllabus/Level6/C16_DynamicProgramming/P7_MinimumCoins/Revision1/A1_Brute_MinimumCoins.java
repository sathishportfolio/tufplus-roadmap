package Level6.C16_DynamicProgramming.P7_MinimumCoins.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Minimum coins
 */
public class A1_Brute_MinimumCoins {

    // Solution : Brute Approach - Minimum coins
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Minimum coins - Brute Approach : " + Arrays.toString(arr));
    }
}
