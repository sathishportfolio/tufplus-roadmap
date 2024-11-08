package Level2.C5_BinarySearch.P6_FindMinimumInRotatedSortedArray.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Search
 * Subcategory: Logic Building
 * Problem: Find minimum in Rotated Sorted Array
 */
public class A1_Brute_FindMinimumInRotatedSortedArray {

    // Solution : Brute Approach - Find minimum in Rotated Sorted Array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Find minimum in Rotated Sorted Array - Brute Approach : " + Arrays.toString(arr));
    }
}
