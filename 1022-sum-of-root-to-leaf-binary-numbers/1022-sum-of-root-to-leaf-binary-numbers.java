/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int dfs(TreeNode root, int c)
    {
        if(root==null) return 0;
        c=c*2+root.val;
        if(root.left==null && root.right==null)
        {
            return c;
        }
        return dfs(root.left,c) +dfs(root.right,c);
    }
    public int sumRootToLeaf(TreeNode root) {
       return dfs(root,0);
    }
}