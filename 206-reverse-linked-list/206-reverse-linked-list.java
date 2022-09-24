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
    public ListNode reverseList(ListNode head) {
        
        ListNode c=head;
        ListNode p=null;
        ListNode n=head;
       return Reverse_rec(c,p,n);
    }
    
    public static ListNode Reverse_rec(ListNode c, ListNode p, ListNode n){
        if(c==null)return p;
        
        n= n.next;
        c.next=p;
        p=c;
        c=n;
        return  Reverse_rec(c,p,n);
        
    }
}