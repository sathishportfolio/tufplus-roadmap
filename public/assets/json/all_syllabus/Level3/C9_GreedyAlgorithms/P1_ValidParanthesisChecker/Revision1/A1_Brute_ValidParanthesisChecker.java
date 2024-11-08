package Level3.C9_GreedyAlgorithms.P1_ValidParanthesisChecker.Revision1;

import java.util.Arrays;
/**
 * Category: Greedy Algorithms
 * Subcategory: Hard
 * Problem: Valid Paranthesis Checker
 */
public class A1_Brute_ValidParanthesisChecker {

    // Solution : Brute Approach - Valid Paranthesis Checker
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Valid Paranthesis Checker - Brute Approach : " + Arrays.toString(arr));
    }
}
