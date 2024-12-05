public class DoublyLinkedList {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next  = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        // traversing till the condition meet i.e. when the last element next points to null
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void insertAfter(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        // as the node.next may be null if node is last element
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.value + " <-> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("\nPrint in reverse");
        while (last != null) {
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node (int val) {
            this.value = val;
        }

        public Node (int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        } 

    }
}