import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder  {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {

        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        // here to make tree we are comparing the value of 2 node so we are overriding this compareTo() method
        // compare property of node
        @Override
        public int compareTo(Node other) {
            // if it return -ve then the current node value is smaller and if it return +ve then then current node value is bigger and if return 0 then both are equal
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        // frequency map of string
        HashMap<Character, Integer> fmap = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);

            // if the current character is already present
            if (fmap.containsKey(cc)) {
                int ov = fmap.get(cc);

                ov += 1;

                fmap.put(cc, ov);
            } else {
                fmap.put(cc, 1);
            }
        }

        // creating a min heap
        Heap<Node> minHeap = new Heap<>();
        // it will give me set of map value pair like a --> 60 in map. a is key and 60 is it's value
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        // for every entry I have to create node
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        // now create full tree
        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    // osf :- output so far
    // like for a encoding value is 0
    private void initEncoderDecoder(Node node, String osf) {
        if (node == null) {
            return;
        }

        // leaf node are the individual character of the string
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }

        // the left side of tree are given value of 0

        initEncoderDecoder(node.left, osf+"0");

        // the right side of tree are given value of 1
        initEncoderDecoder(node.right, osf+"1");
    }

    public String encode(String source) {
        String ans = "";

        for (int i = 0; i < source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String codedString) {
        String key = "";
        String ans = "";
        
        for (int i = 0; i < codedString.length(); i++) {
            key = key + codedString.charAt(i);

            if (decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}