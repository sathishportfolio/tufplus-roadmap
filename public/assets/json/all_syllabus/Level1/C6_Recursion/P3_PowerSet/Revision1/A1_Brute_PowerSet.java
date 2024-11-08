package Level1.C6_Recursion.P3_PowerSet.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Implementation Problems
 * Problem: Power Set
 */
public class A1_Brute_PowerSet {

    // Solution : Brute Approach - Power Set
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Power Set - Brute Approach : " + Arrays.toString(arr));
    }
}
