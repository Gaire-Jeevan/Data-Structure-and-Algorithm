package Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();

        // stack.push(34);
        // stack.push(4);
        // stack.push(3);
        // stack.push(7);
        // stack.push(84);

        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }


        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(52);
        // queue.add(6);
        // queue.add(852);
        // queue.add(7);
        // queue.add(60);

        // System.out.println(queue.peek());

        // while (!queue.isEmpty()) {
        //     System.out.println(queue.remove());
        // }

        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(89);
        dequeue.add(8);
        dequeue.add(9);
        dequeue.add(890);
        dequeue.add(809);

        System.out.println(dequeue.removeLast());
        System.out.println(dequeue.removeFirst());
    }
}