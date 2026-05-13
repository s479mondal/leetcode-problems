/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t=head;
        if(head==null)
        {
            return false;
        }
        ListNode fast=head;
        ListNode normal=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            normal=normal.next;
            if(fast==normal)
            {
                return true;
            }
        }
        return false;
    }
}