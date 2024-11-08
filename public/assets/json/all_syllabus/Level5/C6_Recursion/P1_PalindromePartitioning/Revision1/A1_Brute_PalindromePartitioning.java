package Level5.C6_Recursion.P1_PalindromePartitioning.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: FAQs (Hard)
 * Problem: Palindrome partitioning
 */
public class A1_Brute_PalindromePartitioning {

    // Solution : Brute Approach - Palindrome partitioning
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Palindrome partitioning - Brute Approach : " + Arrays.toString(arr));
    }
}
