/**
 * date: 2018/9/7 13:44
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pPath = new ArrayList<>();
        List<TreeNode> qPath = new ArrayList<>();
        searchPath(root, p, pPath);
        searchPath(root, q, qPath);

        int size = pPath.size();
        for (int i = 0; i < size; i++) {
            if (qPath.contains(pPath.get(i))) {
                return pPath.get(i);
            }
        }

        return null;
    }


    boolean searchPath(TreeNode root, TreeNode node, List<TreeNode> path) {
        if (root == null) {
            return false;
        }

        if (root == node) {
            path.add(root);
            return true;
        }

        if (searchPath(root.left, node, path)) {
            path.add(root);
            return true;
        }

        if (searchPath(root.right, node, path)) {
            path.add(root);
            return true;
        }

        return false;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }else {
            return root;
        }

    }
}
