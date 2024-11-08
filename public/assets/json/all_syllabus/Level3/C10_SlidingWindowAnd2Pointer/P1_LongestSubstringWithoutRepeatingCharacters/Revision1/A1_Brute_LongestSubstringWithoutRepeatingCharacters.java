package Level3.C10_SlidingWindowAnd2Pointer.P1_LongestSubstringWithoutRepeatingCharacters.Revision1;

import java.util.Arrays;
/**
 * Category: Sliding Window / 2 Pointer
 * Subcategory: Longest and Smallest Window Problems
 * Problem: Longest Substring Without Repeating Characters
 */
public class A1_Brute_LongestSubstringWithoutRepeatingCharacters {

    // Solution : Brute Approach - Longest Substring Without Repeating Characters
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest Substring Without Repeating Characters - Brute Approach : " + Arrays.toString(arr));
    }
}
