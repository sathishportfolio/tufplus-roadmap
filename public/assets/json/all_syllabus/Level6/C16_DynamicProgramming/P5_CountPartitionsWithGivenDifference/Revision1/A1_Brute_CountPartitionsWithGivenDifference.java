package Level6.C16_DynamicProgramming.P5_CountPartitionsWithGivenDifference.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on subsequences
 * Problem: Count partitions with given difference
 */
public class A1_Brute_CountPartitionsWithGivenDifference {

    // Solution : Brute Approach - Count partitions with given difference
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count partitions with given difference - Brute Approach : " + Arrays.toString(arr));
    }
}
