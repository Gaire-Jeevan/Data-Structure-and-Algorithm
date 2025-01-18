import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountTotalTargetPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // goal is to check how many path are exist with the target sum not necessary the path should be from root to leaf
    int countPath(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();

        return helper(node, sum, path);
    }

    int helper(TreeNode node, int sum, List<Integer> path) {
        if (node == null) {
            return 0;
        }

        path.add(node.val);

        int count = 0;
        int s = 0;

        // how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();

            // check from back if sum of any element is equals to target sum then increase the iterator
            if (s == sum) {
                count++;
            }
        }

        count += helper(node.left, s, path) + helper(node.right, sum, path);

        // backtrack --> as i am making changes in original list
        // removing last element of list
        path.remove(path.size() - 1);
        return count;
    }
}
