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
    public ListNode sortList(ListNode head) {
       ListNode start= head;
        
        // check that how many nodes avilable in ListNode
        int count=0;
        
        while(start!=null){
            count++;
            start=start.next;
        }
        
        // Make a Array Of Size count to save the values of nodes
        int[]temp= new int[count];
        
        start=head;
        int idx=0;
        while(start!=null){
            temp[idx++]=start.val;
            start=start.next;
        }
        
        Arrays.sort(temp); // sort the Array and put these values in nodeList
        
        ListNode ans= new ListNode(0);
        ListNode lst=ans;
        idx=0;
        
        while(idx!=count){
            lst.next=new ListNode(temp[idx++]);
            lst=lst.next;
        }
        return ans.next;
    }
}