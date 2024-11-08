package Level1.C1_BeginnerProblems.S11_BasicRecursion.P10_CheckIfTheArrayIsSorted.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Recursion
 * Problem: Check if the array is sorted
 */
public class A1_Brute_CheckIfTheArrayIsSorted {

    // Solution : Brute Approach - Check if the array is sorted
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if the array is sorted - Brute Approach : " + Arrays.toString(arr));
    }
}
