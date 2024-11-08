package Level3.C15_Graphs.P4_DetectACycleInADirectedGraph.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Cycles 
 * Problem: Detect a cycle in a directed graph
 */
public class A1_Brute_DetectACycleInADirectedGraph {

    // Solution : Brute Approach - Detect a cycle in a directed graph
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Detect a cycle in a directed graph - Brute Approach : " + Arrays.toString(arr));
    }
}
