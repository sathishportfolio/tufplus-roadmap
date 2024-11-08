package Level1.C13_BinaryTrees.P4_PostorderTraversal.Revision1;

import java.util.Arrays;
/**
 * Category: Binary Trees
 * Subcategory: Theory/Traversals
 * Problem: Postorder Traversal
 */
public class A1_Brute_PostorderTraversal {

    // Solution : Brute Approach - Postorder Traversal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n Postorder Traversal - Brute Approach : " + Arrays.toString(arr));
    }
}
