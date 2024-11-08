package Level2.C17_Tries.P3_MaximumXorOfTwoNumbersInAnArray.Revision1;

import java.util.Arrays;
/**
 * Category: Tries
 * Subcategory: Problems
 * Problem: Maximum XOR of two numbers in an array
 */
public class A1_Brute_MaximumXorOfTwoNumbersInAnArray {

    // Solution : Brute Approach - Maximum XOR of two numbers in an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Maximum XOR of two numbers in an array - Brute Approach : " + Arrays.toString(arr));
    }
}
