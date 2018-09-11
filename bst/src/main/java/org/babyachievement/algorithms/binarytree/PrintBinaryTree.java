/**
 * date: 2018/9/11 16:40
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {

    int totalHeight;

    public List<List<String>> printTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        totalHeight = maxHeight(root);

        List<List<String>> levelStrs = new ArrayList<>(totalHeight);
        for (int i = 0; i < totalHeight; i++) {
            ArrayList<String> levelStr = new ArrayList<>();
            fillNEmpty(levelStr, (1 << totalHeight - i - 1) - 1);
            levelStrs.add(levelStr);
        }

        inOrderTravel(root, levelStrs, 1);

        for (int i = 0; i < totalHeight; i++) {
            fillNEmpty(levelStrs.get(i), (1 << totalHeight - i - 1) - 1);
        }

        return levelStrs;
    }

    private void inOrderTravel(TreeNode root, List<List<String>> levelStrs, int currentHeight) {
        if (null == root) {

            for (int i = currentHeight; i <= totalHeight; i++) {
                List<String> level = levelStrs.get(i - 1);
                int numOfNode = 1 << i - currentHeight;
                fillNEmpty(level, numOfNode);
                fillNEmpty(level, numOfNode*((1 << totalHeight - i + 1) - 1));
            }

            return;
        }

        inOrderTravel(root.left, levelStrs, currentHeight + 1);
        levelStrs.get(currentHeight - 1).add(String.valueOf(root.val));
        fillNEmpty(levelStrs.get(currentHeight - 1), (1 << totalHeight - currentHeight + 1) - 1);
        inOrderTravel(root.right, levelStrs, currentHeight + 1);
    }

    private int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }

    private void fillNEmpty(List<String> level, int n) {
        for (int i = 0; i < n && level.size() < (1 << totalHeight) - 1; i++) {
            level.add("");
        }
    }
}
