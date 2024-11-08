package Level7.C15_Graphs.P2_NumberOfOperationsToMakeNetworkConnected.Revision1;

import java.util.Arrays;
/**
 * Category: Graphs
 * Subcategory: Hard Problems II
 * Problem: Number of operations to make network connected
 */
public class A1_Brute_NumberOfOperationsToMakeNetworkConnected {

    // Solution : Brute Approach - Number of operations to make network connected
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Number of operations to make network connected - Brute Approach : " + Arrays.toString(arr));
    }
}
