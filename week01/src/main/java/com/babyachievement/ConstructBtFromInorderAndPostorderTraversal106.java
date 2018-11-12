/**
 * date: 2018/11/8 14:46
 */

package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 */
public class ConstructBtFromInorderAndPostorderTraversal106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int[] lastIndex = new int[1];
        lastIndex[0]= postorder.length-1;
        return buildTree(inorder, postorder, 0, inorder.length - 1, lastIndex);
    }

    TreeNode buildTree(int[] inorder, int[] postorder, int iStart, int iEnd, int[] lastIndex) {

        if(iStart>iEnd)
            return null;

        TreeNode treeNode = new TreeNode(postorder[lastIndex[0]--]);
        if (iStart == iEnd) {
            return treeNode;
        }



        int index = 0;
        for (int i = iStart; i <= iEnd; i++) {
            if (inorder[i] == treeNode.val) {
                index = i;
                break;
            }
        }

        treeNode.right = buildTree(inorder, postorder, index + 1, iEnd,
                                   lastIndex);

        treeNode.left = buildTree(inorder, postorder, iStart, index - 1,
                                  lastIndex);


        return treeNode;
    }
}
