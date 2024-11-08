package Level2.C3_Arrays.P2_RemoveDuplicatesFromSortedArray.Revision1;

import java.util.Arrays;
/**
 * Category: Arrays
 * Subcategory: Logic Building
 * Problem: Remove duplicates from sorted array
 */
public class A1_Brute_RemoveDuplicatesFromSortedArray {

    // Solution : Brute Approach - Remove duplicates from sorted array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Remove duplicates from sorted array - Brute Approach : " + Arrays.toString(arr));
    }
}
