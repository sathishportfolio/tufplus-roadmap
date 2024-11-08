package Level2.C11_StackAndQueues.P1_NextGreaterElement.Revision1;

import java.util.Arrays;
/**
 * Category: Stack / Queues
 * Subcategory: Monotonic Stack
 * Problem: Next Greater Element
 */
public class A1_Brute_NextGreaterElement {

    // Solution : Brute Approach - Next Greater Element
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Next Greater Element - Brute Approach : " + Arrays.toString(arr));
    }
}
