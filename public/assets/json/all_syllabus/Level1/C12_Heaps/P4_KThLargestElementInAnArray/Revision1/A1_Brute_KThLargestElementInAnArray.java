package Level1.C12_Heaps.P4_KThLargestElementInAnArray.Revision1;

import java.util.Arrays;
/**
 * Category: Heaps
 * Subcategory: Theory and Implementation
 * Problem: K-th Largest element in an array
 */
public class A1_Brute_KThLargestElementInAnArray {

    // Solution : Brute Approach - K-th Largest element in an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n K-th Largest element in an array - Brute Approach : " + Arrays.toString(arr));
    }
}