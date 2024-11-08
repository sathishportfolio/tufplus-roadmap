package Level1.C1_BeginnerProblems.S8_BasicArrays.P4_CheckIfTheArrayIsSorted.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Arrays
 * Problem: Check if the array is sorted
 */
public class A2_Better_CheckIfTheArrayIsSorted {

    // Solution : Better Approach - Check if the array is sorted
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if the array is sorted - Better Approach : " + Arrays.toString(arr));
    }
}