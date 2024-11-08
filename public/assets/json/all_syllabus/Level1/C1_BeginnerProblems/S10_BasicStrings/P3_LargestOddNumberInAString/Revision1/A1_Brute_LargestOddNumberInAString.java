package Level1.C1_BeginnerProblems.S10_BasicStrings.P3_LargestOddNumberInAString.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Strings
 * Problem: Largest odd number in a string
 */
public class A1_Brute_LargestOddNumberInAString {

    // Solution : Brute Approach - Largest odd number in a string
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Largest odd number in a string - Brute Approach : " + Arrays.toString(arr));
    }
}
