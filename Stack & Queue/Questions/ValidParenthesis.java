import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "[";

        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    else {
                        
                    }
                }

                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }

                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
