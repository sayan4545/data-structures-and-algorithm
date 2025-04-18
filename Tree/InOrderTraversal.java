public class InOrderTraversal {
    static class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
        }
    }
    public void TraverseInOrder(Node root){
        if(root == null) return;
        TraverseInOrder(root.left);
        System.out.print(root.value + " ");
        TraverseInOrder(root.right);
    }
    public void TraversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+ " ");
        TraversePreOrder(root.left);
        TraversePreOrder(root.right);

    }
    public void TraversePostOrder(Node root){
        if(root == null) return;
        TraversePostOrder(root.left);
        TraversePostOrder(root.right);
        System.out.print(root.value+ " ");
    }
}

