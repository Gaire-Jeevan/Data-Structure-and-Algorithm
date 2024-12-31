public class CheckPalindromeLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size;

    public CheckPalindromeLinkedList() {
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


    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

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

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


    // check Palindrome
    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);

        Node reReverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(reReverseHead);

        if (head == null || headSecond == null) {
            return true;
        }
        else {
            return false;
        }
    }


    // https://leetcode.com/problems/reorder-list/description/
    // Google, Facebook

    // RE-ORDER LINKED LIST
    // l1 --> ln , l2 --> ln-1, l3 --> ln-2 ...

    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = middleNode(head);

        Node headSecond = reverseList(mid); // end
        Node headFirst = head;              // start

        // rearrange
        while (headFirst != null && headSecond != null) {
            Node temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;


            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        // setting next of tail to null
        if (headFirst != null) {
            headFirst.next = null;
        }
    }

// this solution is wrong
    // REVERSE K-NODES IN LINKED LIST
    // https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    // it also reversing the ''' < k ''' end items --> modify it accordingly ---> practice question
    public Node reverseKGroup(Node head, int k) {

        if (k == 1 || head == null) {
            return head;
        }

        // skip the first left - 1 nodes
        Node current = head;
        Node prev = null;

        while (true) {
           
    
            Node last = prev;
            Node newEnd = current;
    
            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
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
            
            if (current == null) {
                break;
            }

            prev = newEnd;
        }
        return head;

        
    }

// this solution is wrong
    // reverse ALternative k-Nodes in Linked List
    public Node reverseAlternatesKGroup(Node head, int k) {

        if (k == 1 || head == null) {
            return head;
        }

        // skip the first left - 1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
    
            Node last = prev;
            Node newEnd = current;
    
            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
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
            
            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;

        
    }


    // Rotate List
    // https://leetcode.com/problems/rotate-list/description/
    public Node rotateRight(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotation = k % length;

        int skip = length - rotation;
        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
