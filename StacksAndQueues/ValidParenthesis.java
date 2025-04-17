import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        String str = "((()))";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.size()==0){
                st.push(str.charAt(i));
                continue;
            }


            if(st.peek()=='(' || st.peek()=='{' ||st.peek()=='['){
                st.push(str.charAt(i));
            }
            
            else{
                //if(st.isEmpty()) return false;
                if(str.charAt(i)==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                }
                else{
                    return false;
                }
                if(str.charAt(i)==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                }
                else{
                    return false;
                }
                if(str.charAt(i)=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                }
                else{
                    return false;
                }
            }
            
        }
        return st.isEmpty();
       
       
    }
    
}
