package Level5.C16_DynamicProgramming.P1_BestTimeToBuyAndSellStock.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on stocks
 * Problem: Best time to buy and sell stock
 */
public class A1_Brute_BestTimeToBuyAndSellStock {

    // Solution : Brute Approach - Best time to buy and sell stock
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Best time to buy and sell stock - Brute Approach : " + Arrays.toString(arr));
    }
}