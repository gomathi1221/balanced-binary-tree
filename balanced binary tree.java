class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        
        if(depth(root)==-1){
            return false;
        }
        return true;

    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=depth(root.left);
        int r=depth(root.right);
        if(l == -1||r==-1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
    
}