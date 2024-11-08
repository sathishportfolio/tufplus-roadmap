package Level5.C15_Graphs.P9_FloydWarshallAlgorithm.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Floyd warshall algorithm
 */
public class A3_Optimal_FloydWarshallAlgorithm {

    // Solution : Optimal Approach - Floyd warshall algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Floyd warshall algorithm - Optimal Approach : " + Arrays.toString(arr));
    }
}
