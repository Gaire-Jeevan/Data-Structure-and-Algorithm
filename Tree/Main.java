import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.populate(scanner);
        tree.prettyDisplay();

        System.out.print("Preorder traversal of tree:- ");
        tree.preOrder();
        System.out.println();

        System.out.print("Inorder traversal of tree:- ");
        tree.inOrder();
        System.out.println();

        System.out.print("Postorder traversal of tree:- ");
        tree.postOrder();



        // for BinarySearch Tree

        // UNSORTED ARRAY
        // BinarySearchTree tree = new BinarySearchTree();

        // int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        // tree.populate(nums);

        // tree.display();

        // SORTED ARRAY
        // int[] sortedNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // tree.poulatedSorted(sortedNums);
        // tree.display();
    }
}
