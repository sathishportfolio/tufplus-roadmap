package Level2.C14_BinarySearchTrees.P6_ConstructABstFromAPreorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Search Trees
 * Subcategory: Medium
 * Problem: Construct a BST from a preorder traversal
 */
public class A2_Better_ConstructABstFromAPreorderTraversal {

    // Solution : Better Approach - Construct a BST from a preorder traversal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Construct a BST from a preorder traversal - Better Approach : " + Arrays.toString(arr));
    }
}
