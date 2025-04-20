public class LowestCommonAncestor{
    public static void main(String[] args) {
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        if(root.val  == p.val) return p;
        if(root.val == q.val) return q;
        TreeNode leftAns = lowestCommonAncestor(root.left,p,q);
        TreeNode rightAns = lowestCommonAncestor(root.right,p,q);
        if(leftAns !=null && rightAns == null) return leftAns;
        else if(leftAns == null && rightAns !=null) return rightAns;
        else if(leftAns == null && rightAns == null) return null;
        else{
            return root;
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}