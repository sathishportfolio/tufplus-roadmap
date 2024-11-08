package Level1.C1_BeginnerProblems.S7_BasicMaths.P7_CheckIfTheNumberIfArmstrong.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Maths
 * Problem: Check if the number is armstrong
 */
public class A1_Brute_CheckIfTheNumberIfArmstrong {

    // Solution : Brute Approach - Check if the number is armstrong
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if the number is armstrong - Brute Approach : " + Arrays.toString(arr));
    }
}
