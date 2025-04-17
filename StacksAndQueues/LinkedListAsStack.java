import java.util.LinkedList;

public class LinkedListAsStack {
    LinkedList<Integer> stack ;
    public LinkedListAsStack(){
        stack = new LinkedList<>();
    }

    public void  push(int element){
        stack.addFirst(element);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int pop() throws Exception{
        if (stack.isEmpty()){
            throw new Exception("No elements to pop");
        }
        int popped = stack.removeFirst();
        return popped;
    }

    public int peek() throws Exception{
        if (stack.isEmpty()){
            throw new Exception("No element to peek");
        }
        return stack.getLast();
    }
    public int size(){
        return stack.size();
    }
    public void display(){
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.get(i) + " -- > ");
        }
        System.out.print(" END ");

    } 
}

