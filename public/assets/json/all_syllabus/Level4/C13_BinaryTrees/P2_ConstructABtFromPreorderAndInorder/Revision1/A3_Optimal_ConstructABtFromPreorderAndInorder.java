package Level4.C13_BinaryTrees.P2_ConstructABtFromPreorderAndInorder.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Construction Problems
 * Problem: Construct a BT from Preorder and Inorder
 */
public class A3_Optimal_ConstructABtFromPreorderAndInorder {

    // Solution : Optimal Approach - Construct a BT from Preorder and Inorder
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Construct a BT from Preorder and Inorder - Optimal Approach : " + Arrays.toString(arr));
    }
}
