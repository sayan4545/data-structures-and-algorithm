public class MaxDepthOfATree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public int MaxDepth(Node root){
        if (root == null) return 0;
        int rightHeight = MaxDepth(root.right);
        int leftHeight = MaxDepth(root.left);
        return Math.max(leftHeight, leftHeight) +1;
    }
    
}
