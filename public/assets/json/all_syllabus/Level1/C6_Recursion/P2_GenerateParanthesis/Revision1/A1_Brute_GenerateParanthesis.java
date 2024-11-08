package Level1.C6_Recursion.P2_GenerateParanthesis.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: Implementation Problems
 * Problem: Generate Paranthesis
 */
public class A1_Brute_GenerateParanthesis {

    // Solution : Brute Approach - Generate Paranthesis
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Generate Paranthesis - Brute Approach : " + Arrays.toString(arr));
    }
}
