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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p=new ListNode(0);
        ListNode t=p;
        ListNode temp1=list1;
        ListNode temp2=list2;

        if(list1==null || list2==null)
        {
            if(list1==null)
            {
                return list2;
            }
            else if(list2==null)
            {
                return list1;
            }
            else
            {
                return null;
            }

        }
        while(temp1!=null && temp2!=null )
        {
            if(temp1.val>=temp2.val)
            {
                p.next=temp2;
                temp2=temp2.next;
            }
            else
            {
                p.next=temp1;
                temp1=temp1.next;
            }
            p=p.next;
        }
        if(temp1!=null)
        {
            p.next=temp1;
        }
        else
        {
            p.next=temp2;
        }
        return t.next;
    }
}