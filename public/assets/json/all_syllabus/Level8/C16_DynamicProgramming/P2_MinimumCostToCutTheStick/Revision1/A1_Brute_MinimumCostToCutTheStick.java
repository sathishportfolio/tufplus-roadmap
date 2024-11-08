package Level8.C16_DynamicProgramming.P2_MinimumCostToCutTheStick.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: MCM DP
 * Problem: Minimum cost to cut the stick
 */
public class A1_Brute_MinimumCostToCutTheStick {

    // Solution : Brute Approach - Minimum cost to cut the stick
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Minimum cost to cut the stick - Brute Approach : " + Arrays.toString(arr));
    }
}
