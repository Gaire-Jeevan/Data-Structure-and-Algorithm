import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            // to remove parents first
            int levelSize = queue.size();

            // current level list
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                // normal order
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
    
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } 
                // reverse order
                else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
    
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }

                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }                
            }
            // changing reverse if reverse is true make and it false and vice-versa
            reverse = !reverse;
            
            result.add(currentLevel);
        }
        return result;
    }
}
