/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public boolean isPalindrome(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return true;
        }    
        ListNode slow,fast;
        slow=fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h=reverse(slow.next);
        slow.next=null;
        boolean r=isidentical(head,h);
        h=reverse(h);
        slow.next=h;
        return r;
    }
    public boolean isidentical(ListNode n1,ListNode n2)
    {
        while(n1!=null && n2!=null)
        {
            if(n1.val!=n2.val)
            {
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head2)
    {
        ListNode cur,n,prv;
        cur=head2;
        prv=null;
        while(cur!=null)
        {
            n=cur.next;
            cur.next=prv;
            prv=cur;
            cur=n;
        }
        return prv;
    }
}