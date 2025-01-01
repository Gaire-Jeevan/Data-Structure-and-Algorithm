package Stack;
public class StackMain {
    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);

        // stack.push(5);
        // stack.push(55);
        // stack.push(105);
        // stack.push(7);
        // stack.push(32);

        // while (!stack.isEmpty()) {
            
        //     System.out.println(stack.pop());
        // }


        DynamicStack stack = new DynamicStack(5);

        stack.push(5);
        stack.push(55);
        stack.push(105);
        stack.push(7);
        stack.push(32);
        stack.push(3);

        while (!stack.isEmpty()) {
            
            System.out.println(stack.pop());
        }
       
    }
}
