package Level1.C1_BeginnerProblems.S11_BasicRecursion.P8_CheckIfANumberIsPrimeOrNot.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Recursion
 * Problem: Check if a number is prime or not
 */
public class A1_Brute_CheckIfANumberIsPrimeOrNot {

    // Solution : Brute Approach - Check if a number is prime or not
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if a number is prime or not - Brute Approach : " + Arrays.toString(arr));
    }
}
