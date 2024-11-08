package Level5.C15_Graphs.P5_CheapestFlightWithinKStops.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Cheapest flight within K stops
 */
public class A1_Brute_CheapestFlightWithinKStops {

    // Solution : Brute Approach - Cheapest flight within K stops
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Cheapest flight within K stops - Brute Approach : " + Arrays.toString(arr));
    }
}