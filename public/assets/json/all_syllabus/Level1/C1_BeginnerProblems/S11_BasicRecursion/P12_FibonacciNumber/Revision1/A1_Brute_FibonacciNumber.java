package Level1.C1_BeginnerProblems.S11_BasicRecursion.P12_FibonacciNumber.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Recursion
 * Problem: Fibonacci Number
 */
public class A1_Brute_FibonacciNumber {

    // Solution : Brute Approach - Fibonacci Number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Fibonacci Number - Brute Approach : " + Arrays.toString(arr));
    }
}