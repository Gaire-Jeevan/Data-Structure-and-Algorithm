import java.lang.classfile.components.ClassPrinter.ListNode;

public class MergeSort {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    static ListNode merge(ListNode list1, ListNode list2) {
        MergeSort merge = new MergeSort();
        ListNode dummyHead = merge.new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }

            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

   static ListNode getMiddle(ListNode head) {
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        } 

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }


    


    public static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        MergeSort merge = new MergeSort();

        ListNode node = merge.new ListNode(5);
        node.next = merge.new ListNode(4);
        node.next.next = merge.new ListNode(3);
        node.next.next.next = merge.new ListNode(2);
        node.next.next.next.next = merge.new ListNode(1);

        display(node);
        node = sortList(node);

        display(node);
    }
}
