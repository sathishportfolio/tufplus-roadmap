package Level1.C1_BeginnerProblems.S11_BasicRecursion.P11_SumOfDigitsInAGivenNumber.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Recursion
 * Problem: Sum of digits in a given number
 */
public class A1_Brute_SumOfDigitsInAGivenNumber {

    // Solution : Brute Approach - Sum of digits in a given number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Sum of digits in a given number - Brute Approach : " + Arrays.toString(arr));
    }
}
