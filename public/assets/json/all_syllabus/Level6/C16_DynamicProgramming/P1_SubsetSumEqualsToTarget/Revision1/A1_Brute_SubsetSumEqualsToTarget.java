package Level6.C16_DynamicProgramming.P1_SubsetSumEqualsToTarget.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Subset sum equals to target
 */
public class A1_Brute_SubsetSumEqualsToTarget {

    // Solution : Brute Approach - Subset sum equals to target
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Subset sum equals to target - Brute Approach : " + Arrays.toString(arr));
    }
}
