import java.util.Stack;

public class RemoveAdjacentEqualElements {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        stack1.push('c');
        stack1.push('b');
        stack1.push('d');
        System.out.println("Stack1 before prcessing: " + stack1);

        while (!stack1.isEmpty()) {
            char current = stack1.pop();
            if (!stack2.isEmpty() && stack2.peek() == current) {
                stack2.pop();
            } else {
                stack2.push(current);
            }

        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        System.out.println("Stack1 (after processing): " + stack1);
        System.out.println("Stack2 (result): " + stack2);
    }
}