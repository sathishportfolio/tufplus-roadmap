package Level1.C1_BeginnerProblems.S9_BasicHashing.P1_HighestOccurringElementInAnArray.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Hashing
 * Problem: Highest occurring element in an array
 */
public class A1_Brute_HighestOccurringElementInAnArray {

    // Solution : Brute Approach - Highest occurring element in an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Highest occurring element in an array - Brute Approach : " + Arrays.toString(arr));
    }
}
