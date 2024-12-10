public class CircularLinkedNode{
    private Node tail;
    private Node head;


    public CircularLinkedNode() {
        this.tail = null;
        this.head = null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // insert
    public void insert(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // delete
    public void delete(int val) {
        Node node = head;

        if (node == null) {
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;

            if(n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);

    }

    // displaying
    public void display() {
        Node node = head;

        do {
           System.out.print(node.value + " -> "); 
           node = node.next;
        } while (node != head);
        System.out.println(" Head ");
    }
}