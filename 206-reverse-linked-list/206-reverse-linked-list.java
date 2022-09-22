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
        ListNode list= new ListNode(-1,null);
        ListNode temp=head;
        
        while(temp!=null){
            ListNode ans= new ListNode(temp.val,list.next);
            list.next=ans;
            temp=temp.next;
        }
        
        return list.next;
    
        
    }
}