package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/maximum-width-of-binary-tree/description/
 */
public class MaximumWidthOfBinaryTree {
    int maxWidth;
    int height;

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        height = BSTUtils.maxHeight(root);

        int[] startIndexOfEachLevel = new int[height + 1];
        int[] widthOfEachLevel = new int[height + 1];
        int[] endIndexOfEachLevel = new int[height + 1];
        maxWidth = 0;

        calculateMaxWidthOfEachLevel(root, startIndexOfEachLevel,
                                     widthOfEachLevel,
                                     endIndexOfEachLevel, 1);

        return maxWidth;
    }

    private void calculateMaxWidthOfEachLevel(TreeNode root, int[]
            startIndexOfEachLevel, int[] widthOfEachLevel, int[] endIndexOfEachLevel, int currentHeight) {

        if (root == null) {
            for (int i = currentHeight; i <= height; i++) {
                // 如果前面有节点了
                widthOfEachLevel[i] += (1 << i - currentHeight);
            }
            return;
        }


        calculateMaxWidthOfEachLevel(root.left, startIndexOfEachLevel,
                                     widthOfEachLevel,
                                     endIndexOfEachLevel, currentHeight + 1);
        widthOfEachLevel[currentHeight] += 1;
        if (startIndexOfEachLevel[currentHeight] == 0) {
            startIndexOfEachLevel[currentHeight] =
                    widthOfEachLevel[currentHeight];
        }

        endIndexOfEachLevel[currentHeight] = widthOfEachLevel[currentHeight];
        calculateMaxWidthOfEachLevel(root.right, startIndexOfEachLevel,
                                     widthOfEachLevel,
                                     endIndexOfEachLevel, currentHeight + 1);

        maxWidth = Math.max(maxWidth,
                            endIndexOfEachLevel[currentHeight] - startIndexOfEachLevel[currentHeight] + 1);
    }

    /**
     * 使用二叉树的特点，为每个节点进行编号，则left = 2 * current; right = 2* current +1
     *
     * @param root
     * @return
     */
    public int widthOfBinaryTree2(TreeNode root) {
        return calWidth(root, 1, 1, new ArrayList<>());
    }

    private int calWidth(TreeNode root, int id, int level, ArrayList<Integer>
            leftMostIdOfEachLevel) {
        if (root == null) {
            return 0;
        }

        if (level > leftMostIdOfEachLevel.size()) {
            leftMostIdOfEachLevel.add(id);
        }

        int leftMax = calWidth(root.left,
                               id * 2,
                               level + 1,
                               leftMostIdOfEachLevel);
        int rightMax = calWidth(root.right, id * 2 + 1, level + 1,
                                leftMostIdOfEachLevel);

        return Math.max(id - leftMostIdOfEachLevel.get(level - 1) + 1, Math.max(
                leftMax, rightMax));
    }
}
