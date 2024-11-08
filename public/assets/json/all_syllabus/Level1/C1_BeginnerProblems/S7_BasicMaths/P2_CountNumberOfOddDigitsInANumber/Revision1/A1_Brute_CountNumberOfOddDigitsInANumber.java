package Level1.C1_BeginnerProblems.S7_BasicMaths.P2_CountNumberOfOddDigitsInANumber.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Maths
 * Problem: Count number of odd digits in a number
 */
public class A1_Brute_CountNumberOfOddDigitsInANumber {

    // Solution : Brute Approach - Count number of odd digits in a number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count number of odd digits in a number - Brute Approach : " + Arrays.toString(arr));
    }
}
