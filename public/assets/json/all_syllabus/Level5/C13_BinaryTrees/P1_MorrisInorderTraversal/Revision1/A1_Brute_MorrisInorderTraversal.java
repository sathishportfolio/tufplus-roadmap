package Level5.C13_BinaryTrees.P1_MorrisInorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Traversal in Constant Space
 * Problem: Morris Inorder Traversal 
 */
public class A1_Brute_MorrisInorderTraversal {

    // Solution : Brute Approach - Morris Inorder Traversal 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Morris Inorder Traversal  - Brute Approach : " + Arrays.toString(arr));
    }
}
