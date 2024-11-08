package Level2.C12_Heaps.P3_KthLargestElementInAStreamOfRunningIntegers.Revision1;

import java.util.Arrays;
/**
 * Category: Heaps
 * Subcategory: FAQs
 * Problem: Kth largest element in a stream of running integers
 */
public class A1_Brute_KthLargestElementInAStreamOfRunningIntegers {

    // Solution : Brute Approach - Kth largest element in a stream of running integers
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Kth largest element in a stream of running integers - Brute Approach : " + Arrays.toString(arr));
    }
}
