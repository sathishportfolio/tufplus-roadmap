package Level4.C16_DynamicProgramming.P1_GridUniquePaths.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on grids
 * Problem: Grid unique paths
 */
public class A1_Brute_GridUniquePaths {

    // Solution : Brute Approach - Grid unique paths
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Grid unique paths - Brute Approach : " + Arrays.toString(arr));
    }
}
