package Level2.C16_DynamicProgramming.P3_FrogJumpWithKDistances.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: 1D DP
 * Problem: Frog jump with K distances
 */
public class A1_Brute_FrogJumpWithKDistances {

    // Solution : Brute Approach - Frog jump with K distances
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Frog jump with K distances - Brute Approach : " + Arrays.toString(arr));
    }
}
