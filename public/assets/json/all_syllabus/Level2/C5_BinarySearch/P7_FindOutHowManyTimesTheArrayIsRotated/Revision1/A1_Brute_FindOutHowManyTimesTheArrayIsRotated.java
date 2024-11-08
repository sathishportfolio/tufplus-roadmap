package Level2.C5_BinarySearch.P7_FindOutHowManyTimesTheArrayIsRotated.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Search
 * Subcategory: Logic Building
 * Problem: Find out how many times the array is rotated
 */
public class A1_Brute_FindOutHowManyTimesTheArrayIsRotated {

    // Solution : Brute Approach - Find out how many times the array is rotated
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Find out how many times the array is rotated - Brute Approach : " + Arrays.toString(arr));
    }
}
