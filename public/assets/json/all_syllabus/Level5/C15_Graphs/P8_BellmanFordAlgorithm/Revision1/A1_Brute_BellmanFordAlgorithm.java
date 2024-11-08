package Level5.C15_Graphs.P8_BellmanFordAlgorithm.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Bellman ford algorithm
 */
public class A1_Brute_BellmanFordAlgorithm {

    // Solution : Brute Approach - Bellman ford algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Bellman ford algorithm - Brute Approach : " + Arrays.toString(arr));
    }
}