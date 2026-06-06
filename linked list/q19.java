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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int pos=count-n+1;
        if(pos==1){
            return head.next;
        }
        int k=1;
        temp=head;
        ListNode prev=null;
        while(k<pos-1){
            temp=temp.next;
            k++;
        }
        temp.next=temp.next.next;
        return head;
    }
}