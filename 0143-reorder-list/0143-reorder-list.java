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
    public void reorderList(ListNode head) {
        ListNode t1=head;
        ListNode t2=head;
        while(t2.next!=null && t2.next.next!=null)
        {
            t1=t1.next;
            t2=t2.next.next;
        }
        ListNode c=t1.next;
        t1.next=null;
        ListNode n=null,p=null;
        while(c!=null)
        {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        t2=p;
        t1=head;
        while(t2!=null)
        {
            ListNode p1=t1.next;
            ListNode p2=t2.next;

            t1.next=t2;
            t2.next=p1;
            t1=p1;
            t2=p2;

        }





 
    }
}