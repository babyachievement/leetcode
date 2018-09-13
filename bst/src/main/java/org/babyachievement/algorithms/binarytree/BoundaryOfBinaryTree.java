/**
 * date: 2018/9/12 18:36
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.lintcode.com/problem/boundary-of-binary-tree/description
 */
public class BoundaryOfBinaryTree {
    /**
     * @param root: a TreeNode
     * @return: a list of integer
     */
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        result.add(root.val);
        addLeftBoundary(root.left, result);
        if(root.left!=null || root.right!=null)
        addLeafBoundary(root, result);
        addRightBoundary(root.right, result);
        return result;
    }

    private void addLeafBoundary(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right==null) {
            result.add(root.val);
        }
        addLeafBoundary(root.left, result);


        addLeafBoundary(root.right, result);


    }

    private void addRightBoundary(TreeNode right, List<Integer> result) {
        if (right != null) {
            if (right.right != null) {
                addRightBoundary(right.right, result);
            }   else {
                addRightBoundary(right.left, result);
            }
            if(right.left!=null || right.right!=null)
                result.add(right.val);

        }
    }

    private void addLeftBoundary(TreeNode root, List<Integer> result) {
        if (root != null) {
            if(root.left!=null || root.right!=null)
                result.add(root.val);

            if (root.left != null) {
                addLeftBoundary(root.left, result);
            } else  {
                addLeftBoundary(root.right, result);
            }
        }
    }
}
