package Level7.C16_DynamicProgramming.P4_MinimumInsertionsToMakeStringPalindrome.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on strings
 * Problem: Minimum insertions to make string palindrome
 */
public class A1_Brute_MinimumInsertionsToMakeStringPalindrome {

    // Solution : Brute Approach - Minimum insertions to make string palindrome
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Minimum insertions to make string palindrome - Brute Approach : " + Arrays.toString(arr));
    }
}
