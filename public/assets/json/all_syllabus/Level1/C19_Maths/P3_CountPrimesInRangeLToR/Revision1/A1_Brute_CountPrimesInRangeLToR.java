package Level1.C19_Maths.P3_CountPrimesInRangeLToR.Revision1;

import java.util.Arrays;
/**
 * Category: Maths
 * Subcategory: Sieve of Eratosthenes
 * Problem: Count primes in range L to R
 */
public class A1_Brute_CountPrimesInRangeLToR {

    // Solution : Brute Approach - Count primes in range L to R
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count primes in range L to R - Brute Approach : " + Arrays.toString(arr));
    }
}
