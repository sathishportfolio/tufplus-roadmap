package Level2.C15_Graphs.P4_NumberOfEnclaves.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Traversal Problems
 * Problem: Number of enclaves
 */
public class A1_Brute_NumberOfEnclaves {

    // Solution : Brute Approach - Number of enclaves
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Number of enclaves - Brute Approach : " + Arrays.toString(arr));
    }
}
