/**
 * date: 2018/11/15 16:44
 */

package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://www.lintcode.com/problem/count-univalue-subtrees/description
 */
public class CountUnivalueSubtrees250 {
    /**
     * @param root: the given tree
     * @return: the number of uni-value subtrees.
     */
    public int countUnivalSubtrees(TreeNode root) {
        // write your code here

        int[] count = new int[1];
        isUnivalSubtree(root, count);

        return count[0];
    }


    public boolean isUnivalSubtree(TreeNode node, int[] count) {
        if (node == null) {
            return true;
        }

        if (node.left == null && node.right == null) {
            count[0]++;
            return true;
        }

        final boolean univalLeft  = isUnivalSubtree(node.left, count);
        final boolean univalRight = isUnivalSubtree(node.right, count);
        if (univalLeft && univalRight) {
            if (node.left != null && node.right != null
                    && node.left.val == node.right.val
                    && node.left.val == node.val) {
                count[0]++;
                return true;
            }

            if (node.left == null && node.right != null) {
                if (node.val == node.right.val) {
                    count[0]++;
                    return true;
                }
            }

            if (node.right == null && node.left != null) {
                if (node.val == node.left.val) {
                    count[0]++;
                    return true;
                }
            }
        }
        return false;
    }

    public int dfs(TreeNode node, int v) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        final int leftNum   = dfs(node.left, node.val);
        final int leftRight = dfs(node.right, node.val);


        return leftNum + leftRight;
    }
}
