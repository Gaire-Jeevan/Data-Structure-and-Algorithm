public class AVL {
        public class Node {
            private int value;
            private int height;
            private Node right;
            private Node left;
    
            public Node (int value) {
                this.value = value;
            }
    
            public int getValue() {
                return value;
            }
        }
    
        private Node root;
    
        public AVL() {
    
        }
    
        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }
    
        public boolean isEmpty() {
            return root == null;
        }
    
        public void insert(int value) {
            root = insert(value, root);
        }
    
        private Node insert(int value, Node node) {
    
            if (node == null) {
                node = new Node(value);
                return node;
            }
    
            if (value < node.value) {
                node.left = insert(value, node.left);
            }
    
            if (value > node.value) {
                node.right = insert(value, node.right);
            }
    
            // the parent height is 1 more than the maximum height of 2 children
            node.height = Math.max(height(node.left), height(node.right)) + 1;
    
            // if already something is attached to left or right then same left or right is returned 
            return rotate(node);
        }

        private Node rotate(Node node) {
            if ((height(node.left) - height(node.right)) > 1) {
                // left heavy
                if ((height(node.left.left) - height(node.left.right)) > 0) {
                    // left left case
                    return rightRotate(node);
                }

                if ((height(node.left.left) - height(node.left.right)) < 0) {
                    // left right case

                    // making all parent - child - grandchild in same line
                    node.left = leftRotate(node.left);

                    // rotate as case 1st
                    return rightRotate(node);
                }
            }
            
            
            if ((height(node.left) - height(node.right)) < -1) {
                // right heavy
                if ((height(node.right.right) - height(node.right.left)) > 0) {
                    // right right case
                    return leftRotate(node);
                }

                if ((height(node.right.right) - height(node.right.left)) < 0) {
                    // right left case

                    // making all parent - child - grandchild in same line
                    node.right = rightRotate(node.right);

                    // rotate as case 1st
                    return leftRotate(node);
                }
            }

            // if node is balanced return normal node
            return node;
        }


        // LEFT ROTATE
        public Node leftRotate(Node p) {
            // p = parent
            // c = child

            Node c = p.right;
            Node t = c.left;

            c.left = p;
            p.right = t;

            p.height = Math.max(height(p.left), height(p.right) + 1);
            c.height = Math.max(height(c.left), height(c.right) + 1);

            // new node is c which become root so return c
            return c;
        }


        // RIGHT ROTATE
        public Node rightRotate(Node p) {
            // p = parent
            // c = child

            Node c = p.left;
            Node t = c.right;

            c.right = p;
            p.left = t;

            p.height = Math.max(height(p.left), height(p.right) + 1);
            c.height = Math.max(height(c.left), height(c.right) + 1);

            // new node is c which become root so return c
            return c;
        }

    
        public void populate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                this.insert(nums[i]);
            }
        }
    
        public void poulatedSorted(int[] nums) {
            populateSorted(nums, 0, nums.length);
        }
    
        private void populateSorted(int[] nums, int start, int end) {
            if (start >= end) {
                return;
            }
    
            int mid = (start + end) / 2;
    
            this.insert(nums[mid]);
            populateSorted(nums, start, mid);
            populateSorted(nums, mid + 1, end);
    
        }
    
        public boolean balanced() {
            return balanced(root);
        }
    
        private boolean balanced(Node node) {
            if (node == null) {
                return true;
            }
    
            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        }
    
        public void display() {
            display(this.root, "Root Node: ");
        }
    
        private void display(Node node, String details) {
            if (node == null) {
                return;
            }
    
            System.out.println(details + node.getValue());
    
            display(node.left, "Left child of " + node.getValue() + " : ");
            display(node.right, "Right child of " + node.getValue() + " : ");
        }
    
    
}
