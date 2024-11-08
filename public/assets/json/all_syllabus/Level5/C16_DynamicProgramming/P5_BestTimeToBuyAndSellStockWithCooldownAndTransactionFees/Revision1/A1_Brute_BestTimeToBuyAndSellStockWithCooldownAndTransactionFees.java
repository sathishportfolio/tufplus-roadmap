package Level5.C16_DynamicProgramming.P5_BestTimeToBuyAndSellStockWithCooldownAndTransactionFees.Revision1;

import java.util.Arrays;
/**
 * Category: Dynamic Programming
 * Subcategory: DP on stocks
 * Problem: Best time to buy and sell stock with transaction fees
 */
public class A1_Brute_BestTimeToBuyAndSellStockWithCooldownAndTransactionFees {

    // Solution : Brute Approach - Best time to buy and sell stock with transaction fees
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Best time to buy and sell stock with transaction fees - Brute Approach : " + Arrays.toString(arr));
    }
}
