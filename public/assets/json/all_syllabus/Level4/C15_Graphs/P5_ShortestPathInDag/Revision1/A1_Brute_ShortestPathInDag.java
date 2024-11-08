package Level4.C15_Graphs.P5_ShortestPathInDag.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Hard Problems
 * Problem: Shortest path in DAG
 */
public class A1_Brute_ShortestPathInDag {

    // Solution : Brute Approach - Shortest path in DAG
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Shortest path in DAG - Brute Approach : " + Arrays.toString(arr));
    }
}
