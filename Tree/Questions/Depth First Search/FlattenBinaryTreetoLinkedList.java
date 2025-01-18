public class FlattenBinaryTreetoLinkedList {
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

    public void flatten(TreeNode root) {
        // as i don't change root i will only change the structure of tree so making new refrence that points to root and it is going to change for every iteration
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                // right most empty space to place the right side of root to the rightmost empty space of left side of root
                TreeNode temp = current.left;

                while (temp.right != null) {
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;

            }
            // it over for current node now solve in right side if any element is present in any node of right side of node than apply same solution
            current = current.right;
        }
    }
}
