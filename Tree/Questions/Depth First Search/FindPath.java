public class FindPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // path from root to leaf
    boolean findPath(TreeNode node, int[] arr) {

        if (node == null) {
            // if array is empty then return false if node == null else return false
            return arr.length == 0;
        }

        // 0 as the first level and the index to check path starts from 0 of array
        return helper(node, arr, 0);
    }

    boolean helper(TreeNode node, int[] arr, int index) {
        if (node == null) {
            return false;
        }

        if (index >= arr.length || node.val != arr[index]) {
            return false;
        }

        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }

        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }
}
