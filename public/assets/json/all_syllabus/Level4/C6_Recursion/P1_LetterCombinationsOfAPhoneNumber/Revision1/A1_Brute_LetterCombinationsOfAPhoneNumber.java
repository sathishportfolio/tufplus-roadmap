package Level4.C6_Recursion.P1_LetterCombinationsOfAPhoneNumber.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Hard
 * Problem: Letter Combinations of a Phone Number
 */
public class A1_Brute_LetterCombinationsOfAPhoneNumber {

    // Solution : Brute Approach - Letter Combinations of a Phone Number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Letter Combinations of a Phone Number - Brute Approach : " + Arrays.toString(arr));
    }
}
