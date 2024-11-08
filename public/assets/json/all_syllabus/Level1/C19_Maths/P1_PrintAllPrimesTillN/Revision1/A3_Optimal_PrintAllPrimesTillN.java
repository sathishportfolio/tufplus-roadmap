package Level1.C19_Maths.P1_PrintAllPrimesTillN.Revision1;

import java.util.Arrays;
/**
 * Category: Maths
 * Subcategory: Sieve of Eratosthenes
 * Problem: Print all primes till N
 */
public class A3_Optimal_PrintAllPrimesTillN {

    // Solution : Optimal Approach - Print all primes till N
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Print all primes till N - Optimal Approach : " + Arrays.toString(arr));
    }
}
