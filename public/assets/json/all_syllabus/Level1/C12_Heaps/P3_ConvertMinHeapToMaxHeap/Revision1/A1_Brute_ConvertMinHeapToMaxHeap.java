package Level1.C12_Heaps.P3_ConvertMinHeapToMaxHeap.Revision1;

import java.util.Arrays;
/**
 * Category: Heaps
 * Subcategory: Theory and Implementation
 * Problem: Convert Min Heap to Max Heap
 */
public class A1_Brute_ConvertMinHeapToMaxHeap {

    // Solution : Brute Approach - Convert Min Heap to Max Heap
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Convert Min Heap to Max Heap - Brute Approach : " + Arrays.toString(arr));
    }
}