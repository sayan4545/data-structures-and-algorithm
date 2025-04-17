
package Tree;


public class BuildTree {

    public static void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    public static void main(String[] args) {
        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);
        Node node6 = new Node(600);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = null;
        node3.left = node5;
        node4.right = node6;

        preOrderTraversal(node1);

    }

    // Definition of the Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
        
            
    }
    
}
