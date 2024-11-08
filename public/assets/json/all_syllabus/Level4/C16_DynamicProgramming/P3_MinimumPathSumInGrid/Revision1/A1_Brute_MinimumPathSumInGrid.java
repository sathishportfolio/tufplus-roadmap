package Level4.C16_DynamicProgramming.P3_MinimumPathSumInGrid.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on grids
 * Problem: Minimum path sum in grid
 */
public class A1_Brute_MinimumPathSumInGrid {

    // Solution : Brute Approach - Minimum path sum in grid
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Minimum path sum in grid - Brute Approach : " + Arrays.toString(arr));
    }
}
