/**
 * date: 2018/10/25 10:40
 */

package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode             end   = root;
        TreeNode             start = root;
        List<Integer>        level = new ArrayList<>();
        level.add(root.val);
        result.add(level);
        queue.add(end);
        boolean              fromRight  = true;

        TreeNode treeNode = null;
        while (!queue.isEmpty()) {
            if (fromRight) {
                treeNode = queue.pollFirst();

                if (treeNode == start) {
                    level = new ArrayList<>();
                }

                if (treeNode.right != null) {
                    queue.addLast(treeNode.right);
                    level.add(treeNode.right.val);
                }

                if (treeNode.left != null) {
                    queue.addLast(treeNode.left);
                    level.add(treeNode.left.val);
                }

                if (treeNode == end) {
                    start = queue.peekLast();
                    end = queue.peekFirst();
                    if(!level.isEmpty())
                    result.add(level);
                    fromRight = false;
                }

            } else {
                treeNode = queue.pollLast();

                if (treeNode == start) {
                    level = new ArrayList<>();
                }

                if (treeNode.left != null) {
                    queue.addFirst(treeNode.left);
                    level.add(treeNode.left.val);
                }

                if (treeNode.right != null) {
                    queue.addFirst(treeNode.right);
                    level.add(treeNode.right.val);
                }

                if (treeNode == end) {
                    start = queue.peekFirst();
                    end = queue.peekLast();
                    if(!level.isEmpty())
                    result.add(level);
                    fromRight = true;
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        compute(root, ans, 0);
        return ans;
    }

    private static void compute(TreeNode curr, List<List<Integer>> ans, int level) {
        if (curr == null) return;

        if (ans.size() == level)
            ans.add(new ArrayList<Integer>());

        if (level % 2 == 0)
            ans.get(level).add(curr.val);
        else
            ans.get(level).add(0, curr.val);

        compute(curr.left, ans, level + 1);
        compute(curr.right, ans, level + 1);
    }
}
