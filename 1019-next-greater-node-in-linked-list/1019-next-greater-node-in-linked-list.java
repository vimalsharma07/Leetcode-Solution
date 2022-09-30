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
    public static int[] NextGreater(ListNode head, int size){
        int[]ans= new int[size]; int idx=size-1;
        ListNode temp= head;
        Stack<Integer> st= new Stack<>();
        while(temp!=null){
            while(!st.isEmpty()&& temp.val>=st.peek())st.pop();
            ans[idx--]=st.isEmpty()?0:st.peek();
            st.push(temp.val);
            temp=temp.next;
        }
        return ans;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        ListNode p=null;
        ListNode c=head;
        ListNode n=head;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
            size++;
        }
        return NextGreater(p,size);
    }
}