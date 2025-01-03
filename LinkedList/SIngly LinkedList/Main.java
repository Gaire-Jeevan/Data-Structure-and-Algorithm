public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(27);

        list.insert(54, 3);
        list.display();

        // Deletion
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();
    }
}
