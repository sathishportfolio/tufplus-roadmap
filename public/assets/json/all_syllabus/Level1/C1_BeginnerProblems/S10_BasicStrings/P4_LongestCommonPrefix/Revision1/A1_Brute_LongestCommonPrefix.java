package Level1.C1_BeginnerProblems.S10_BasicStrings.P4_LongestCommonPrefix.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Strings
 * Problem: Longest common prefix
 */
public class A1_Brute_LongestCommonPrefix {

    // Solution : Brute Approach - Longest common prefix
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest common prefix - Brute Approach : " + Arrays.toString(arr));
    }
}
