package Level6.C16_DynamicProgramming.P2_PartitionEqualSubsetSum.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Partition equal subset sum
 */
public class A1_Brute_PartitionEqualSubsetSum {

    // Solution : Brute Approach - Partition equal subset sum
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Partition equal subset sum - Brute Approach : " + Arrays.toString(arr));
    }
}
