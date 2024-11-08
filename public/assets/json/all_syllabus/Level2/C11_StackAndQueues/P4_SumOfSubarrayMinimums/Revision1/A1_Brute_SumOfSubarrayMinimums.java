package Level2.C11_StackAndQueues.P4_SumOfSubarrayMinimums.Revision1;

import java.util.Arrays;
/**
 * Category: Stack / Queues
 * Subcategory: Monotonic Stack
 * Problem: Sum of Subarray Minimums
 */
public class A1_Brute_SumOfSubarrayMinimums {

    // Solution : Brute Approach - Sum of Subarray Minimums
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Sum of Subarray Minimums - Brute Approach : " + Arrays.toString(arr));
    }
}
