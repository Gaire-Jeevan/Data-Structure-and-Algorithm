import java.util.Stack;

public class DFSUsingStack {
    public class TreeNode {
                int val;
                TreeNode left;
                TreeNode right;
                TreeNode(int x) { val = x; }
            }

    void dfsStack(TreeNode node) {
        if (node == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode removed = stack.pop();

            System.out.println(removed.val +" ");

            // push right first as in stack we pop last element that we push. and in tree we always work with left side element first
            if (removed.right != null) {
                stack.push(removed.right);
            }
            if (removed.left != null) {
                stack.push(removed.left);
            }
        }
    }
}
