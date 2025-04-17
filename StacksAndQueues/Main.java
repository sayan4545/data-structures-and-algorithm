public class Main {
    public static void main(String[] args) {
        LinkedListAsStack ls = new LinkedListAsStack();
        ls.push(100);
        ls.push(200);
        ls.push(1000);
        ls.push(200);
        ls.push(600);
        ls.display();
        System.out.println();
        try {
            System.out.println(ls.pop());
        } catch (Exception  e) {
            e.printStackTrace();
        }

        ls.display();
      
    }
    
}
