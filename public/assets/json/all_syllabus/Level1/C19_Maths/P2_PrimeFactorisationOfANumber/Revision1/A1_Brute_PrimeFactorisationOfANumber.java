package Level1.C19_Maths.P2_PrimeFactorisationOfANumber.Revision1;

import java.util.Arrays;
/**
 * Category: Maths
 * Subcategory: Sieve of Eratosthenes
 * Problem: Prime factorisation of a Number
 */
public class A1_Brute_PrimeFactorisationOfANumber {

    // Solution : Brute Approach - Prime factorisation of a Number
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Prime factorisation of a Number - Brute Approach : " + Arrays.toString(arr));
    }
}
