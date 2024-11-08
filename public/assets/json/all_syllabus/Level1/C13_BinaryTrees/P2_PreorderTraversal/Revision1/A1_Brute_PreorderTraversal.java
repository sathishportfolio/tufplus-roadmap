package Level1.C13_BinaryTrees.P2_PreorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Theory/Traversals
 * Problem: Preorder Traversal
 */
public class A1_Brute_PreorderTraversal {

    // Solution : Brute Approach - Preorder Traversal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Preorder Traversal - Brute Approach : " + Arrays.toString(arr));
    }
}
