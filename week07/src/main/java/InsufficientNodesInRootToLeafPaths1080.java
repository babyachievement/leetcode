import org.babyachievement.algorithms.structure.TreeNode;

/**
 * date: 2019/7/29 15:40
 */

public class InsufficientNodesInRootToLeafPaths1080 {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (!isSufficient(root, limit, 0)) {
            return null;
        }

        return root;
    }

    boolean isSufficient(TreeNode root, int limit, int sum) {
        if (root.left == null && root.right == null) {
            return sum + root.val >= limit;
        }


        boolean isLeftSufficient = false;
        if (root.left != null) {
            isLeftSufficient = isSufficient(root.left, limit,
                                            sum + root.val);
        }

        boolean isRightSufficient = false;
        if (root.right != null) {
            isRightSufficient = isSufficient(root.right,
                                             limit,
                                             sum + root.val);
        }

        if (!isLeftSufficient) {
            root.left = null;
        }

        if (!isRightSufficient) {
            root.right = null;
        }

        return isLeftSufficient || isRightSufficient;
    }
}
