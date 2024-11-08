package Level5.C6_Recursion.P7_SudokoSolver.Revision1;

import java.util.Arrays;
/**
 * Category: Recursion
 * Subcategory: FAQs (Hard)
 * Problem: Sudoko Solver
 */
public class A1_Brute_SudokoSolver {

    // Solution : Brute Approach - Sudoko Solver
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Sudoko Solver - Brute Approach : " + Arrays.toString(arr));
    }
}
