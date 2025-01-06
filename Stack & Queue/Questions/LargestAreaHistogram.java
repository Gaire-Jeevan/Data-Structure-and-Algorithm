import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        // the stack gonna contain smallest item till '''i'''
        for (int i = 0; i < heights.length; i++) {
            
            // increasing items
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack ,max, i);
            }
            stack.push(i);
        }

        // after done traversing in the array then we need to calculate max for every element that is in the stack
        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack ,max, i);
        }

        return max;
    }

    public static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();

        if (stack.isEmpty()) {
            area = arr[popped] * i;
        }

        else {
            area = arr[popped] * ((i - 1) - stack.peek());
        }

        return Math.max(max, area);
    }
}
