package Level3.C15_Graphs.P3_TopologicalSortOrKahnsAlgorithm.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Cycles 
 * Problem: Topological sort or Kahn's algorithm
 */
public class A1_Brute_TopologicalSortOrKahnsAlgorithm {

    // Solution : Brute Approach - Topological sort or Kahn's algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Topological sort or Kahn's algorithm - Brute Approach : " + Arrays.toString(arr));
    }
}
