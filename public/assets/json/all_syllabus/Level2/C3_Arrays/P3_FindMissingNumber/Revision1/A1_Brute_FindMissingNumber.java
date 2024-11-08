package Level2.C3_Arrays.P3_FindMissingNumber.Revision1;

import java.util.Arrays;
/**
 * Category: Arrays
 * Subcategory: Logic Building
 * Problem: Find missing number
 */
public class A1_Brute_FindMissingNumber {

    // Solution : Brute Approach - Find missing number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Find missing number - Brute Approach : " + Arrays.toString(arr));
    }
}
