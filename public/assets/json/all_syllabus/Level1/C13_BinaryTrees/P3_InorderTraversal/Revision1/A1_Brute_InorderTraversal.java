package Level1.C13_BinaryTrees.P3_InorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Theory/Traversals
 * Problem: Inorder Traversal
 */
public class A1_Brute_InorderTraversal {

    // Solution : Brute Approach - Inorder Traversal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Inorder Traversal - Brute Approach : " + Arrays.toString(arr));
    }
}
