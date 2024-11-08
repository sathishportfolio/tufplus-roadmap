package Level1.C13_BinaryTrees.P6_PrePostInorderInOneTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Theory/Traversals
 * Problem: Pre, Post, Inorder in one traversal
 */
public class A1_Brute_PrePostInorderInOneTraversal {

    // Solution : Brute Approach - Pre, Post, Inorder in one traversal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Pre, Post, Inorder in one traversal - Brute Approach : " + Arrays.toString(arr));
    }
}
