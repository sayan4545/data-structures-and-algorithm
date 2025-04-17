

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal{
    public static void main(String[] args) {
        Node node1 = new Node(100);
        Node node2 = new Node(110);
        Node node3 = new Node(130);
        Node node4 = new Node(150);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        lot(node1);
    }
    public static void lot(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            Node  temp = queue.peek();
            queue.poll();
            System.out.print(temp.data +" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right!= null){
                queue.add(temp.right);
            }
        }


    }
    static class Node{
        public int data;
        public Node right;
        public Node left;
    
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
