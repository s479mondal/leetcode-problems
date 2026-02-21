class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return d;
    }
    public int dfs(TreeNode root )
    {
        if(root==null)
        {
            return 0;
        }
        int l=dfs(root.left);
        int r=dfs(root.right);
        int n=l+r;
        d = Math.max(d,n);
       return Math.max(l,r)+1;
    }
}