import org.babyachievement.algorithms.structure.TreeNode;

/**
 * date: 2019/7/31 10:18
 */

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {

        return delete(root, key);
    }

    public TreeNode delete(TreeNode current, int key) {
        if (current == null) {
            return null;
        }

        if (current.val == key) {
            TreeNode t;
            if (current.left != null) {
                t = findLeftLargest(current.left);
                t.right = current.right;
                if (t != current.left) {
                    t.left = current.left;
                }
            } else if (current.right != null) {
                t = findRightSmallest(current.right);
                t.left = current.left;
                if (t != current.right) {
                    t.right = current.right;
                }
            } else {
                t = null;
            }


            return t;
        } else {
            if (current.val < key) {
                current.right = delete(current.right, key);
            } else {
                current.left = delete(current.left, key);
            }
            return current;
        }
    }

    private TreeNode findRightSmallest(TreeNode right) {
        if (right.left == null) {
            return right;
        } else {
            if (right.left.left == null) {
                TreeNode t = right.left;
                right.left = t.right;
                return t;

            } else {
                return findRightSmallest(right.left);
            }
        }
    }

    private TreeNode findLeftLargest(TreeNode left) {
        if (left.right == null) {
            return left;
        } else {
            if (left.right.right == null) {
                TreeNode t = left.right;
                left.right = t.left;
                return t;
            } else {
                return findLeftLargest(left.right);
            }
        }
    }
}
