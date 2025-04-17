import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        String str = "((()))";
        System.out.println(isValid(str));
    }


public static boolean isValid(String str) {
Stack<Character> st = new Stack<>();
for (int i = 0; i < str.length(); i++) {
    char current = str.charAt(i);

    // Push opening brackets onto the stack
    if (current == '(' || current == '{' || current == '[') {
        st.push(current);
    } else {
        // If the stack is empty, the closing bracket is invalid
        if (st.isEmpty()) {
            return false;
        }
        char top = st.peek();
        
        // Check for matching opening bracket at the top of the stack
        if ((current == ')' && top == '(') ||
            (current == ']' && top == '[') ||
            (current == '}' && top == '{')) {
            st.pop(); // Remove the matched opening bracket
        } else {
            return false; // Mismatched bracket
        }
    }
}
return st.isEmpty();
}
}
    

