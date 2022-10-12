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
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        boolean flag= false;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(flag==false){
           
            return null;
        }
        ListNode ans= head;
        while(ans!=slow){
            slow= slow.next;
            ans= ans.next;
        }
       
        
       return slow; 
    }
}