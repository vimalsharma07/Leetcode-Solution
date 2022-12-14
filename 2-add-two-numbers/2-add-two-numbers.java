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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode ans= new ListNode(-1)  , a=l1,b=l2,c=ans;
        
        int carry=0;
        while( a!=null && b!=null){
            int sum= a.val + b.val +carry;
            int digit = sum%10;
            carry=sum/10;
            c.next= new ListNode(digit);
            a=a.next;
            b=b.next;
            c=c.next;
        }
        
        ListNode nel= a==null ? b:a;
        while(nel!=null){
            int sum=  nel.val +carry;
            int digit = sum%10;
            carry=sum/10;
            c.next= new ListNode(digit);
            nel=nel.next;
            c=c.next;
        }
        if(carry!=0){
            c.next= new ListNode (carry);
        }
        return ans.next;
    }
}