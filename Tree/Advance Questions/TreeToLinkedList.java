public class TreeToLinkedList {
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

    public class LinkedListNode {
        int val;
        LinkedListNode prev;
        LinkedListNode next;

        public LinkedListNode (int val) {
            this.val = val;
        }
    }

    LinkedListNode head;
    LinkedListNode tail;

    public LinkedListNode convert(TreeNode root) {

        if (root == null) {
            return null;
        }

        helper(root);

        return head;
    }

    private void helper(TreeNode node) {
        if (node == null) {
            return;
        }

        helper(node.left);

        LinkedListNode newNode = new LinkedListNode(node.val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        helper(node.right);
    }
}
