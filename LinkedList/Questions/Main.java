public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(1);
        list.insertLast(15);
        list.insertLast(2);
        list.insertLast(2);
        list.insertRec(99, 2);

        // list.deleteDuplicates()

        list.display();
    }
}
