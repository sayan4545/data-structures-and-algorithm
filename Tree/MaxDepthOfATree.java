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
    public int diameterOfBinaryTree(Node root){
        if (root == null) return 0;
        int option1 = diameterOfBinaryTree(root.left);
        int option2 = diameterOfBinaryTree(root.right);
        int option3 = MaxDepth(root.left) + MaxDepth(root.right);
        return Math.max(option1,Math.max(option2, option3));
    }
}
