/**
 * date: 2018/9/12 18:28
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-right-side-view/description/
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 1, result);
        return result;
    }

    private void dfs(TreeNode root, int height, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (result.size() < height) {
            result.add(root.val);
        }else {
            result.set(height - 1, root.val);
        }

        dfs(root.left, height+1, result);
        dfs(root.right, height+1, result);
    }
}
