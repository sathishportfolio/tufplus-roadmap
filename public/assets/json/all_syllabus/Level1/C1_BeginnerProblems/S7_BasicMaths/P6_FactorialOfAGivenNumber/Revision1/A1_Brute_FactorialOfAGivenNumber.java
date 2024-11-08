package Level1.C1_BeginnerProblems.S7_BasicMaths.P6_FactorialOfAGivenNumber.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Maths
 * Problem: Factorial of a given number
 */
public class A1_Brute_FactorialOfAGivenNumber {

    // Solution : Brute Approach - Factorial of a given number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Factorial of a given number - Brute Approach : " + Arrays.toString(arr));
    }
}
