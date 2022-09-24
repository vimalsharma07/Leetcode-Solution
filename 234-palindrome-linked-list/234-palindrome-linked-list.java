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
    
    public static ListNode Middle (ListNode head){
        ListNode s= head;
        ListNode f= head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        
        return s;
    }
    
    public static ListNode Reverse (ListNode head){
        ListNode c= head;
        ListNode p= null;
        ListNode n= head;
        
        while(c!=null){
            n=n.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        
       ListNode mid =Middle(head), sh= mid.next;
        System.out.print(mid.val);
        mid.next=null;
        sh=  Reverse(sh);
        while(head != null && sh!=null) {
            if(head.val != sh.val) return false;
            head = head.next;
            sh = sh.next;
        }
        return true;  
    }
}