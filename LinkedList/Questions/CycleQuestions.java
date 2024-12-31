public class CycleQuestions {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    // Cycle Detection
    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            // if we check the condition at first in every case it is going to give true as both fast and slow points to head
                fast = fast.next.next;
                slow = slow.next;
            
            if(fast == slow) {
                return true;
            }
        }

        return false;
    }

    // find length of cycle
    public static int lengthOfCycle(Node head) {
        Node
         fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            // if we check the condition at first in every case it is going to give true as both fast and slow points to head
                fast = fast.next.next;
                slow = slow.next;
            
            if(fast == slow) {

                // calculate the length
                Node temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while(temp != slow);
                return length;
               
            }
        }
        // if cycle not present
        return 0;
    }

    // detect the initial of cycle formation
    public static Node detectCycle(Node head) {
        int length = 0;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            // if we check the condition at first in every case it is going to give true as both fast and slow points to head
                fast = fast.next.next;
                slow = slow.next;
            
            if(fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }

        // if no cycle present return null
        if (length == 0) {
            return null;
        }

        // find start node;
        Node f = head;
        Node s = head;

        // move pointer by length of cycle times
        while (length > 0) {
            s = s.next;
            length--;
        }

        // now i will move both pointer so that they move
        while (f != s) {
            f = f.next;
            s = s.next;
        }
    
        return s;
    }


    // find if number is '''Happy''' or not
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        // int count = 0;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
            // System.out.println(++count+" "+ fast + " " + slow);
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }
         return false;
    }

    private static int findSquare(int number) {
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }


    // FIND THE MIDDLE OF LINKED LIST
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        CycleQuestions cycle = new CycleQuestions();
        Node node = cycle.new Node(1);

        node.next = cycle.new Node(2);
        node.next.next = cycle.new Node(3);
        
        Node meet = cycle.new Node(4);
        
        node.next.next.next = meet;

        meet.next = cycle.new Node(5);
        meet.next.next = cycle.new Node(6);
        meet.next.next.next = cycle.new Node(7);
        meet.next.next.next.next = cycle.new Node(8, meet);

        System.out.println(hasCycle(node));

        System.out.println(lengthOfCycle(node));

        System.out.println(detectCycle(node).val);

        // isHappy(19);;
        System.out.println(isHappy(100) ? "The number is happy" : "The number is not happy");


        // Find middle node
        Node node1 = cycle.new Node(1);
        node1.next = cycle.new Node(2);
        node1.next.next = cycle.new Node (3);
        node1.next.next.next = cycle.new Node (4);
        node1.next.next.next.next = cycle.new Node (5);
        node1.next.next.next.next.next = cycle.new Node (6);

        System.out.println(middleNode(node1).val);
    }
}
