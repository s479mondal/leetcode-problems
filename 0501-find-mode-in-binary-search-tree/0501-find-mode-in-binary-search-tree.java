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
    int max=0;
    List<Integer> list=new LinkedList<>();
    int prv=0;
    int c=0;
    int cv=0;
    public void dfs(TreeNode root)
    {
        if(root==null) return;
        dfs(root.left);

        if(root.val==cv){
            c+=1;
        }
        else
        {
            c=1;
        }
        if(c==max)
        {
            list.add(root.val);
        }
        else if(c>max)
        {
            max=c;
            list.clear();
            list.add(root.val);
        }
        cv=root.val;
        dfs(root.right);
    }
    public int[] findMode(TreeNode root)
    { 
        dfs(root);
        int r[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            r[i]=list.get(i);
        }
        return r;

    }
}