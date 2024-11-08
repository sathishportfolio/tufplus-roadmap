package Level1.C1_BeginnerProblems.S8_BasicArrays.P2_CountOfOddNumbersInArray.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Arrays
 * Problem: Count of odd numbers in array
 */
public class A1_Brute_CountOfOddNumbersInArray {

    // Solution : Brute Approach - Count of odd numbers in array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count of odd numbers in array - Brute Approach : " + Arrays.toString(arr));
    }
}
