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
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        ListNode sr= head;
        while(sr!=null && sr.next!=null){
            temp= temp.next;
            sr=sr.next.next;
        }
       return temp; 
    }
}