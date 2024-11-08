package Level8.C15_Graphs.P1_KosarajuSAlgorithm.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Additional Algorithms
 * Problem: Kosaraju's algorithm
 */
public class A1_Brute_KosarajuSAlgorithm {

    // Solution : Brute Approach - Kosaraju's algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Kosaraju's algorithm - Brute Approach : " + Arrays.toString(arr));
    }
}
