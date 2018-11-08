package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/description/
 */
public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        dfs(root, sum, path, result);
        return result;
    }

    public void dfs(TreeNode node, int sum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null && node.val == sum) {
            path.add(node.val);
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        path.add(node.val);
        dfs(node.left, sum-node.val, path, result);
        dfs(node.right, sum-node.val, path, result);
        path.remove(path.size() - 1);
    }
}
