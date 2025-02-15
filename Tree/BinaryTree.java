import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // insert element
    public void populate(Scanner scanner) {
        System.out.print("Enter the root Node: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to enter left of " + node.value+ ": ");
        
        // asking if user want to insert in left
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.print("Enter the value of the left of " + node.value + ": ");

            int value = scanner.nextInt();

            node.left = new Node(value);
            populate(scanner, node.left);
        }

        // asking if user want to insert in right
        System.out.print("Do you want to enter right of " + node.value+ ": ");

        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.print("Enter the value of the right of " + node.value + ": ");

            int value = scanner.nextInt();

            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {

        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    // before printing node we are printing right, afer right we are printing node and at last left side is printed
    public void prettyDisplay() {
        preetyDisplay(root, 0);
    }

    private void preetyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        preetyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        preetyDisplay(node.left, level + 1);
    }


    // preOrder traversal
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    // inOrder traversal
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // postOrder traversal
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
   
}