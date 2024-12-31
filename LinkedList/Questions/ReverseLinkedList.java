import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReverseLinkedList {
    private Node head = null;
        private Node tail = null;
        private int size;
    
    
        public ReverseLinkedList() {
            this.size = 0;
        }
        
        public class Node {
            private int value;
            private Node next;
    
    
            public Node(int value) {
                this.value= value;
            } 
    
            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    
        public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
    
            if (tail == null ){
                tail = head;
            }
    
            size++;
        }
    
        public void insertLast(int val) {
            if (tail == null) {
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    
        public void insert(int val, int index) {
            if (index == 0) {
                insertFirst(val);
                return;
            }
            if (index == size) {
                insertLast(val);
                return;
            }
    
            Node temp = head;
            // starting from 1 as the 0 is upperone itself
            for (int i = 1; i < index; i++) {
                temp = temp.next;   
            }
    
            Node node = new Node(val, temp.next);
            temp.next = node;
    
            size++;
        }
    
        // Deletion
        public int deleteFirst() {
            int val = head.value;
            head = head.next;
    
            if(head == null) {
                tail = null;
            }
            size--;
            return val;
        }
    
        public int deleteLast() {
            if (size <= 1) {
                return deleteFirst();
            }
    
            Node secondLast = get(size - 2);
            int val = tail.value;
    
            tail = secondLast;
            tail.next = null;
    
            return val;
        }
    
        public int delete(int index) {
            if (index == 0) {
                return deleteFirst();
            }
            if (index == size - 1) {
                return deleteLast();
            }
    
            Node prev = get(index - 1);
            int val = prev.next.value;
    
            prev.next = prev.next.next;
    
            return val;
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
        
        public Node get(int index) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
    
            return node;
        }
    
        // insert using recursion
        public void insertRec(int val, int index) {
            head = insertRec(val, index, head);
        }
    
        private Node insertRec(int val, int index, Node node) {
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
    
            // here node.next because this contain the node that it is actually in (current position of Node) 1 --> 2 --> 9 --> 7 --> END
            // here while going to 9 from 2 we will do node.next which is actually 9 let index to add at 3 and value to add is 10 :- (2, 10, node) --> (1, 10, node.next) --> (0, 10, node.next.next)
    
            // so after value is added the value it return is node.next
            node.next = insertRec(val, index - 1, node.next);
            return node;
        }
    
        public void display() {
            Node temp = head;
    
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    

        // RECURSION REVERSE
        private void reverse(Node node) {
            if (node == tail) {
                head = tail;
                return;
            }

            reverse(node.next);

            tail.next = node;
            tail = node;
            tail.next = null;
        }

        // in place reversal of linked list (Iterative method)
        private void reverse(){

            if (size < 2) {
                return;
            }

            Node prev = null;
            Node current = head;
            Node next = current.next;

            while (current != null) {
                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {

                    next = next.next;
                }
            }
            head = prev;
        }


        // reverse linked list between two nodes
        public Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left - 1 nodes
        Node current = head;
        Node prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        // reverse between left and right
        Node next = current.next;
        for (int i = 0; current != null && i < (right - left + 1); i++) {
            current.next = prev;
            prev = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        return head;
    }

    
        public static void main(String[] args) {
            ReverseLinkedList list1 = new ReverseLinkedList();
            list1.insertLast(5);
            list1.insertLast(4);
            list1.insertLast(3);
            list1.insertLast(2);
            list1.insertLast(1);
            // list.insertRec(99, 2);
    
            list1.display();
    
            list1.reverse();
    
            list1.display();
        }
    
    
}
