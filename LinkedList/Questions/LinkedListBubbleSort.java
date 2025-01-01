import java.util.LinkedList;

public class LinkedListBubbleSort {
    private Node head = null;
    private Node tail = null;
    private int size;


    public LinkedListBubbleSort() {
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


    // BUBBLE SORT TECHNIQUE TO SORT LINKED LIST
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else {
                    Node prev = get(col- 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            bubbleSort(row, col + 1);
        }

        else {
            bubbleSort(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        LinkedListBubbleSort list1 = new LinkedListBubbleSort();
        list1.insertLast(5);
        list1.insertLast(4);
        list1.insertLast(3);
        list1.insertLast(2);
        list1.insertLast(1);
        // list.insertRec(99, 2);

        list1.display();

        list1.bubbleSort();

        list1.display();
    }
}