import java.util.LinkedList;
import java.util.Queue;

public class ImmediateSuccessor {
    

    public TreeNode findSuccessor(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            
            TreeNode currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            
            if (currentNode.val == key) {
                break;
            }
        }
        return queue.peek();
    }
}
