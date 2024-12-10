public class Main {
    public static void main(String[] args) {
        CircularLinkedNode list = new CircularLinkedNode();

        list.insert(23);
        list.insert(2);
        list.insert(7);
        list.insert(85);
        list.insert(52);
        list.insert(99);
        list.insert(65);
        list.display();

        list.delete(99);
        list.display();
    }
}
