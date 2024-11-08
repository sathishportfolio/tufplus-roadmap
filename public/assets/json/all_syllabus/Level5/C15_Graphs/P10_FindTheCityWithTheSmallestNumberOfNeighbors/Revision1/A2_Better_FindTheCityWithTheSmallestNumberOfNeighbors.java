package Level5.C15_Graphs.P10_FindTheCityWithTheSmallestNumberOfNeighbors.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Find the city with the smallest number of neighbors
 */
public class A2_Better_FindTheCityWithTheSmallestNumberOfNeighbors {

    // Solution : Better Approach - Find the city with the smallest number of neighbors
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Find the city with the smallest number of neighbors - Better Approach : " + Arrays.toString(arr));
    }
}