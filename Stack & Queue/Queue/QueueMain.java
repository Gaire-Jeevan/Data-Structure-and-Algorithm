package Queue;
public class QueueMain {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue();

        // queue.insert(3);
        // queue.insert(5);
        // queue.insert(1);
        // queue.insert(563);
        // queue.insert(7);

        // queue.display();

        // while (!queue.isEmpty()) {
        //     System.out.println(queue.remove());
        // }

        CircularQueue queue = new CircularQueue();

        queue.insert(3);
        queue.insert(5);
        queue.insert(1);
        queue.insert(563);
        queue.insert(7);

        queue.display();

        
            System.out.println(queue.remove());
       
    }
}
