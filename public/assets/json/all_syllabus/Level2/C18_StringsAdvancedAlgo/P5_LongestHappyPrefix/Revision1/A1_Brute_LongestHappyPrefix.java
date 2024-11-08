package Level2.C18_StringsAdvancedAlgo.P5_LongestHappyPrefix.Revision1;

import java.util.Arrays;
/**
 * Category: Strings (Advanced Algo)
 * Subcategory: Advanced Problems (Less asked)
 * Problem: Longest happy prefix
 */
public class A1_Brute_LongestHappyPrefix {

    // Solution : Brute Approach - Longest happy prefix
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Longest happy prefix - Brute Approach : " + Arrays.toString(arr));
    }
}
