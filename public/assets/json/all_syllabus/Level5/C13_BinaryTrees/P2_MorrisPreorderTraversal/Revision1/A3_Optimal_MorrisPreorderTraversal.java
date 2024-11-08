package Level5.C13_BinaryTrees.P2_MorrisPreorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Traversal in Constant Space
 * Problem: Morris Preorder Traversal 
 */
public class A3_Optimal_MorrisPreorderTraversal {

    // Solution : Optimal Approach - Morris Preorder Traversal 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Morris Preorder Traversal  - Optimal Approach : " + Arrays.toString(arr));
    }
}
