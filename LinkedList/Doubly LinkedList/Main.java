public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(13);
        list.insertFirst(1);
        list.insertFirst(103);
        list.insertFirst(23);
        list.insertFirst(91);
        list.display();

        list.insertLast(99);
        list.display();

        list.insertAfter(23, 7);
        list.display();
    }
}
