package Level1.C1_BeginnerProblems.S7_BasicMaths.P1_CountAllDigitsOfANumber.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Maths
 * Problem: Count all digits of a number
 */
public class A1_Brute_CountAllDigitsOfANumber {

    // Solution : Brute Approach - Count all digits of a number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count all digits of a number - Brute Approach : " + Arrays.toString(arr));
    }
}
