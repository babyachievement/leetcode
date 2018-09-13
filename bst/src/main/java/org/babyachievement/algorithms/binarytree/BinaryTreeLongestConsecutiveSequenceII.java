/**
 * date: 2018/9/12 18:31
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import sun.nio.cs.ext.MacHebrew;

/**
 * https://www.lintcode.com/problem/binary-tree-longest-consecutive-sequence-ii/description
 */
public class BinaryTreeLongestConsecutiveSequenceII {

    int max;


    /**
     * @param root: the root of binary tree
     * @return: the length of the longest consecutive sequence path
     */
    public int longestConsecutive2(TreeNode root) {
        dfs(root);

        return max;
    }

    /**
     * 返回值为某个节点的最长递增和最长递减序列组成的数组
     */
    int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[2];
        }

        int[] leftArr = dfs(root.left);
        int[] rightArr = dfs(root.right);


        int longestInc = 0;
        int longestDec = 0;

        if (root.left != null) {
            if (root.left.val == root.val - 1) {
                longestInc = leftArr[0];
            }

            if (root.left.val - root.val == 1) {
                longestDec = leftArr[1];
            }
        }

        if (root.right != null) {
            if (root.right.val == root.val - 1) {
                longestInc = Math.max(longestInc, rightArr[0]);
            }

            if (root.right.val - root.val == 1) {
                longestDec = Math.max(longestDec, rightArr[1]);
            }
        }

        max = Math.max(max, Math.max(longestDec+1, longestInc+1));

        if (root.left != null && root.right != null ) {
            if(root.left.val - root.val == root.val - root.right.val && Math.abs(root.val - root.right.val)==1) {
                if (root.left.val > root.right.val) {
                    max = Math.max(max, leftArr[1] + 1 + rightArr[0]);
                }else {
                    max = Math.max(max, leftArr[0] + 1 + rightArr[1]);
                }
            }

        }

        return new int[]{longestInc + 1, longestDec + 1};
    }

}

