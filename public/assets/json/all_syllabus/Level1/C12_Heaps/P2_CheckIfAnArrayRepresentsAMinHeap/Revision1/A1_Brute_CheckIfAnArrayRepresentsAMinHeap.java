package Level1.C12_Heaps.P2_CheckIfAnArrayRepresentsAMinHeap.Revision1;

import java.util.Arrays;
/**
 * Category: Heaps
 * Subcategory: Theory and Implementation
 * Problem: Check if an array represents a min heap 
 */
public class A1_Brute_CheckIfAnArrayRepresentsAMinHeap {

    // Solution : Brute Approach - Check if an array represents a min heap 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Check if an array represents a min heap  - Brute Approach : " + Arrays.toString(arr));
    }
}
