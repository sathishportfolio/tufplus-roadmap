package Level5.C15_Graphs.P7_NumberOfWaysToArriveAtDestination.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Number of ways to arrive at destination
 */
public class A1_Brute_NumberOfWaysToArriveAtDestination {

    // Solution : Brute Approach - Number of ways to arrive at destination
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Number of ways to arrive at destination - Brute Approach : " + Arrays.toString(arr));
    }
}
