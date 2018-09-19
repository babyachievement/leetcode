/**
 * date: 2018/9/18 14:17
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        inOrderDfs(root, result);
        return result;
    }

    private void inOrderDfs(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrderDfs(root.left, result);
        result.add(root.val);
        inOrderDfs(root.right, result);
    }
}
