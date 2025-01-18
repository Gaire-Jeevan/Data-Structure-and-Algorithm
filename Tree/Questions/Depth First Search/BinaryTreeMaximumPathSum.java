public class BinaryTreeMaximumPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        
        helper(root);

        return ans;
    }

    int helper(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        // if left or right is negative then make it 0
        left = Math.max(0, left);
        right = Math.max(0, right);

        // maximum sum including left right and current node
        int maximum = left + right + node.val;

        ans = Math.max(ans, maximum);

        return Math.max(left, right) + node.val;
    }
}
