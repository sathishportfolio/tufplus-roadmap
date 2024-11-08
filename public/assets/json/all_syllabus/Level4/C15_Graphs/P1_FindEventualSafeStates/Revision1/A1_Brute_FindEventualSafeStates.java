package Level4.C15_Graphs.P1_FindEventualSafeStates.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Hard Problems
 * Problem: Find eventual safe states
 */
public class A1_Brute_FindEventualSafeStates {

    // Solution : Brute Approach - Find eventual safe states
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Find eventual safe states - Brute Approach : " + Arrays.toString(arr));
    }
}
