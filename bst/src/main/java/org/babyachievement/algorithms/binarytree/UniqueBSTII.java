/**
 * date: 2018/9/5 14:37
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-binary-search-trees-ii/description/
 */
public class UniqueBSTII {

    public List<TreeNode> generateTrees(int n) {
        return generateTress(1, n);
    }

    public List<TreeNode> generateTress(int start, int end) {
        if (start > end || end < start) {
            return Collections.emptyList();
        }

        List<TreeNode> uniqueBSTs = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = generateTress(start, i - 1);
            List<TreeNode> rightTrees = generateTress(i + 1, end);
            uniqueBSTs.addAll(mergeTree(i, leftTrees, rightTrees));
        }

        return uniqueBSTs;
    }

    private List<TreeNode> mergeTree(int n, List<TreeNode> leftTrees, List<TreeNode> rightTrees) {
        List<TreeNode> trees = new ArrayList<>();
        List<TreeNode> totalTrees = new ArrayList<>();

        if (leftTrees == null || leftTrees.isEmpty()) {
            trees.add(new TreeNode(n));
        } else {
            for (TreeNode leftTree : leftTrees) {
                TreeNode treeNode = new TreeNode(n);
                treeNode.left = leftTree;
                trees.add(treeNode);
            }
        }

        if (null != rightTrees && !rightTrees.isEmpty()) {
            for (TreeNode tree : trees) {

                for (TreeNode rightTree : rightTrees) {
                    TreeNode treeNode = new TreeNode(tree.val);
                    treeNode.left = tree.left;
                    treeNode.right = rightTree;
                    totalTrees.add(treeNode);
                }
            }
        } else {
            totalTrees.addAll(trees);
        }

        return totalTrees;
    }

    public List<TreeNode> generateTrees2(int n) {
        List<List<TreeNode>> result = new ArrayList<>(n + 1);

        result.add(new ArrayList<>());
        if (n > 0) {
            result.get(0).add(null);
        }

        for (int i = 1; i <= n; i++) {
            result.add(new ArrayList<>());

            for (int j = 1; j <= i; j++) {
                for (TreeNode left : result.get(j - 1)) {
                    for (TreeNode right : result.get(i - j)) {
                        TreeNode root = new TreeNode(j);
                        root.left = left;
                        root.right = copy(right, j);
                        result.get(i).add(root);
                    }
                }
            }
        }

        return result.get(n);
    }

    private TreeNode copy(TreeNode right, int j) {
        if (right == null) {
            return null;
        }

        TreeNode treeNode = new TreeNode(right.val + j);
        treeNode.left = copy(right.left, j);
        treeNode.right = copy(right.right, j);
        return treeNode;
    }

}
