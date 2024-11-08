package Level1.C6_Recursion.P3_PowerSet.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Implementation Problems
 * Problem: Power Set
 */
public class A3_Optimal_PowerSet {

    // Solution : Optimal Approach - Power Set
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Power Set - Optimal Approach : " + Arrays.toString(arr));
    }
}
