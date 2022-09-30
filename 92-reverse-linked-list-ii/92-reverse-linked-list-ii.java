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
     public static ListNode GetNode(ListNode p, int idx){
         ListNode temp=p;
         
         for(int i=1; i<idx; i++){
             temp=temp.next;
         }
         return temp;
     }
    public ListNode reverseBetween(ListNode head, int left, int right) {
      ListNode  p =head;
        
     
     while(right>=left){
         ListNode s= GetNode(p,left);
         ListNode e= GetNode(p,right);
         
         int temp= s.val;
         s.val= e.val;
         e.val=temp;
         right--;
         left++;
     }
      
        return head;
        
    }
}