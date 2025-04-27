public class SearchInABST {
    public static void main(String[] args) {
        
    }
    class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }
    static Node search(Node root, int target){
        if(root == null) return null;
        if(root.val == target) return root;
        if(root.val > target) return search(root.left,target);
        return search(root.right,target);
    }
    
}
