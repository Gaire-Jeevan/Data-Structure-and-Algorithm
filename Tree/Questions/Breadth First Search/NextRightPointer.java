public class NextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        Node leftMost = root;

        while (leftMost.left != null) {
            Node current = leftMost;

            while (current != null) {
                // connect it's children
                if (current.left != null && current.right != null) {
                    current.left.next = current.right;
                }

                // to go to its sibling node and connect both sibling children
                if (current.next != null && current.right != null && current.next.left != null) {
                    current.right.next = current.next.left;
                }

            // make curent equals to it's sibling node 
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}
