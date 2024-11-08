package Level7.C16_DynamicProgramming.P5_MinimumInsertionsOrDeletionsToConvertStringAToB.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Minimum insertions or deletions to convert string A to B
 */
public class A1_Brute_MinimumInsertionsOrDeletionsToConvertStringAToB {

    // Solution : Brute Approach - Minimum insertions or deletions to convert string A to B
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Minimum insertions or deletions to convert string A to B - Brute Approach : " + Arrays.toString(arr));
    }
}
