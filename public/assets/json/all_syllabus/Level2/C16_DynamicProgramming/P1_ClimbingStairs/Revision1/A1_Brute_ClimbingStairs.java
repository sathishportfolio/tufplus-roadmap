package Level2.C16_DynamicProgramming.P1_ClimbingStairs.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: 1D DP
 * Problem: Climbing stairs
 */
public class A1_Brute_ClimbingStairs {

    // Solution : Brute Approach - Climbing stairs
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Climbing stairs - Brute Approach : " + Arrays.toString(arr));
    }
}