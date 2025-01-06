import java.util.Stack;

public class QueueUsingStackRemoveEFficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemoveEFficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // adding item in first stack
        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() throws Exception {
        return first.pop();
    }

    public int peek() throws Exception {
        return first.peek();
    }


    public static void main(String[] args) throws Exception {
        QueueUsingStackRemoveEFficient queue = new QueueUsingStackRemoveEFficient();

        queue.add(5);
        queue.add(56);
        queue.add(52);

       System.out.println(queue.remove());
    }
}
