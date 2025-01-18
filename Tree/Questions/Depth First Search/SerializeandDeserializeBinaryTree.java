import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeandDeserializeBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        helper(node, list);

        return list;
    }

    void helper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> list) {

        // I reverse it so that I no need to swap it again and again
        Collections.reverse(list);
        TreeNode node = helper2(list);
        return node;
    }

    TreeNode helper2(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'n') {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
