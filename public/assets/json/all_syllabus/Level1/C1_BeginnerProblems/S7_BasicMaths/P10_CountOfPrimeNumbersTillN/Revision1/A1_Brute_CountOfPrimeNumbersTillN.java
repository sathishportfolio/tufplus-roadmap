package Level1.C1_BeginnerProblems.S7_BasicMaths.P10_CountOfPrimeNumbersTillN.Revision1;

import java.util.Arrays;
/**
 * Category: Beginner Problems
 * Subcategory: Basic Maths
 * Problem: Count of prime numbers till N
 */
public class A1_Brute_CountOfPrimeNumbersTillN {

    // Solution : Brute Approach - Count of prime numbers till N
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count of prime numbers till N - Brute Approach : " + Arrays.toString(arr));
    }
}
