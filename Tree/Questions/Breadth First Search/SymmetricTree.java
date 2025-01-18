import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            //  if both left and right of same level are null
            if (left == null && right == null) {
                continue;
            }

            // only one is false
            if (left == null || right == null) {
                return false;
            }

            // if both values are not equal
            if (left.val != right.val) {
                return false;
            }

            // adding in queue

            // extreme left
            queue.add(left.left);

            // extreme right
            queue.add(right.right);

            // sibling of extreme left
            queue.add(left.right);

            // sibling of extreme right
            queue.add(right.left);

        }

        return true;
    }
}
