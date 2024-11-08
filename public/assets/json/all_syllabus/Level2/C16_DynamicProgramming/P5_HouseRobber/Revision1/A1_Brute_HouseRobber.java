package Level2.C16_DynamicProgramming.P5_HouseRobber.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: 1D DP
 * Problem: House robber
 */
public class A1_Brute_HouseRobber {

    // Solution : Brute Approach - House robber
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n House robber - Brute Approach : " + Arrays.toString(arr));
    }
}
