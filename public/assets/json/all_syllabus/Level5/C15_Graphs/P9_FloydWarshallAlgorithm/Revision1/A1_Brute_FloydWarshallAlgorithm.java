package Level5.C15_Graphs.P9_FloydWarshallAlgorithm.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Shortest Path Algorithms
 * Problem: Floyd warshall algorithm
 */
public class A1_Brute_FloydWarshallAlgorithm {

    // Solution : Brute Approach - Floyd warshall algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Floyd warshall algorithm - Brute Approach : " + Arrays.toString(arr));
    }
}
