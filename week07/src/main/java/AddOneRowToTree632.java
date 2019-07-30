import org.babyachievement.algorithms.structure.TreeNode;

/**
 * date: 2019/7/30 13:55
 */

public class AddOneRowToTree632 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            final TreeNode treeNode = new TreeNode(v);
            treeNode.left = root;
            return treeNode;
        }


        dfs(root, v, d, 1);
        return root;
    }

    public void dfs(TreeNode root, int v, int d, int depth) {
        if (root == null) {
            return;
        }
        if (depth == d - 1) {
            final TreeNode left  = root.left;
            final TreeNode right = root.right;

            root.left = new TreeNode(v);
            root.left.left = left;

            root.right = new TreeNode(v);
            root.right.right = right;
        } else {
            dfs(root.left, v, d, depth + 1);
            dfs(root.right, v, d, depth + 1);
        }
    }
}
