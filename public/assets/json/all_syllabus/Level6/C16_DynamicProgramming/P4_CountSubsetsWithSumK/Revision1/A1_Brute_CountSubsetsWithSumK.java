package Level6.C16_DynamicProgramming.P4_CountSubsetsWithSumK.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Count subsets with sum K
 */
public class A1_Brute_CountSubsetsWithSumK {

    // Solution : Brute Approach - Count subsets with sum K
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count subsets with sum K - Brute Approach : " + Arrays.toString(arr));
    }
}
