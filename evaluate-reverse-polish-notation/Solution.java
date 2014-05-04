public class Solution {
public int evalRPN(String[] tokens) {

    Stack<String> stack = new Stack<String>();

    for (String s : tokens) {

        switch (s) {

        case "+": {
            int a = Integer.valueOf(stack.pop());
            int b = Integer.valueOf(stack.pop());
            String c = String.valueOf(a + b);
            stack.push(c);
            break;
        }

        case "-": {
            int a = Integer.valueOf(stack.pop());
            int b = Integer.valueOf(stack.pop());
            String c = String.valueOf(b - a);
            stack.push(c);
            break;
        }
        case "*": {
            int a = Integer.valueOf(stack.pop());
            int b = Integer.valueOf(stack.pop());
            String c = String.valueOf(a * b);
            stack.push(c);
            break;
        }
        case "/": {
            int a = Integer.valueOf(stack.pop());
            int b = Integer.valueOf(stack.pop());
            String c = String.valueOf(b / a);
            stack.push(c);
            break;
        }
        default:
            stack.push(s);
        }

    }

    return Integer.valueOf(stack.pop());
}
}