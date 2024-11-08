package Level1.C4_Hashing.P4_CountSubarraysWithGivenXorK.Revision1;

import java.util.Arrays;
/**
 * Category: Hashing
 * Subcategory: FAQs
 * Problem: Count subarrays with given xor K
 */
public class A1_Brute_CountSubarraysWithGivenXorK {

    // Solution : Brute Approach - Count subarrays with given xor K
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Count subarrays with given xor K - Brute Approach : " + Arrays.toString(arr));
    }
}
