package Level1.C3_Arrays.P4_MaximumConsecutiveOnes.Revision1;

import java.util.Arrays;
/**
 * Category: Arrays
 * Subcategory: Fundamentals
 * Problem: Maximum Consecutive Ones
 */
public class A1_Brute_MaximumConsecutiveOnes {

    // Solution : Brute Approach - Maximum Consecutive Ones
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Maximum Consecutive Ones - Brute Approach : " + Arrays.toString(arr));
    }
}