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
    public boolean findKthAncestor(TreeNode node,int k,TreeNode p){
        // base case
        if(node == null){
            return false;
        }
        if(node.val == p.val){
            return true;
        }

        boolean leftAns = findKthAncestor(node.left, k, p);
        boolean rightAns = findKthAncestor(node.right,k,p);

        if(leftAns || rightAns){
            k--;
        }
        if(k==0){
            k = -1;
            System.out.println(node.val);
            
        }
        return leftAns || rightAns;
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