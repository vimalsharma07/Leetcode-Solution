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
        ListNode ans= new ListNode (-1);
        
        //  save the reference variable for list1
        ListNode first= list1;
        
        // save the reference variable for list2
        
        ListNode second = list2;
        
        // Reference variable for answer
        
        ListNode head= ans;
        
        while(first!=null && second !=null){
            if(first.val>=second.val){
                head.next=second;
                head=head.next;
                second=second.next;
            }else{
                head.next=first;
                head=head.next;
                first=first.next;
            }
        }
        ListNode rest= first==null?second:first;
        
        while(rest!=null){
            head.next=rest;
            head=rest;
            rest=rest.next;
        }
        return ans.next;
    }
}