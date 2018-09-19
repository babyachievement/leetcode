/**
 * date: 2018/9/18 14:24
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        List<TreeNode> temp = new ArrayList<>();
        temp.add(root);

        List<TreeNode> nextLevelNodes = new ArrayList<>();

        while (!temp.isEmpty()) {
            ArrayList<Integer> levelResult = new ArrayList<>();

            for (TreeNode treeNode : temp) {
                levelResult.add(treeNode.val);
                if (null != treeNode.left)
                    nextLevelNodes.add(treeNode.left);
                if (null != treeNode.right)
                    nextLevelNodes.add(treeNode.right);
            }
            result.add(levelResult);
            temp.clear();
            temp.addAll(nextLevelNodes);
            nextLevelNodes.clear();
        }

        return result;
    }
}
