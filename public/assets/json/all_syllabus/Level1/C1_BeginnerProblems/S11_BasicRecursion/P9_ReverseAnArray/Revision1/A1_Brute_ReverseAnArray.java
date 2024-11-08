package Level1.C1_BeginnerProblems.S11_BasicRecursion.P9_ReverseAnArray.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Recursion
 * Problem: Reverse an array
 */
public class A1_Brute_ReverseAnArray {

    // Solution : Brute Approach - Reverse an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Reverse an array - Brute Approach : " + Arrays.toString(arr));
    }
}
