import org.babyachievement.algorithms.structure.TreeNode;

/**
 * date: 2019/7/29 15:10
 */

public class LongestUnivaluePath687 {
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

    public static void main(String[] args) {
        final TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(1);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(5);

        final LongestUnivaluePath687 longestUnivaluePath687 = new LongestUnivaluePath687();
        longestUnivaluePath687.longestUnivaluePath(treeNode);
    }
}
