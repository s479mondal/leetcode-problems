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
    public void dfs(TreeNode root, int d,List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        if(list.size()==d)
        {
            list.add(root.val);
        }
        dfs(root.right,d+1,list);
        dfs(root.left,d+1,list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        dfs(root,0,list);
        return list;
    }
}